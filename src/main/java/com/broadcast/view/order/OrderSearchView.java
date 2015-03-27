package com.broadcast.view.order;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.List;

import org.apache.commons.lang.StringUtils;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

import com.broadcast.cache.CacheUtils;
import com.broadcast.cache.model.OrderModel;

import static com.broadcast.view.order.OrderTableView.tableView;
import static com.broadcast.view._屏幕view._屏幕view;
import com.broadcast.view.base.IMainView.MessageBox2;
import com.broadcast.view.base.ISearchView;
import com.common.jdbc.page.Pagination;

public class OrderSearchView implements ISearchView {

	public static OrderSearchView searchView = new OrderSearchView();

	private Text _订单数;
	private Text _名称;
	private Button _保存订单;
	private Button _屏幕;

	public void createContents(Shell shell) {
		Label lblNewLabel_1 = new Label(shell, SWT.NONE);
		lblNewLabel_1.setBounds(350, 26, 48, 15);
		lblNewLabel_1.setText("订单数：");

		_订单数 = new Text(shell, SWT.BORDER);
		_订单数.setBounds(404, 24, 333, 18);

		Label lblNewLabel_2 = new Label(shell, SWT.NONE);
		lblNewLabel_2.setBounds(0, 26, 36, 15);
		lblNewLabel_2.setText("名称：");

		_名称 = new Text(shell, SWT.BORDER);
		_名称.setBounds(49, 24, 284, 18);

		_保存订单 = new Button(shell, SWT.NONE);
		_保存订单.setBounds(740, 22, 72, 22);
		_保存订单.setText("保存订单");

		_屏幕 = new Button(shell, SWT.NONE);
		_屏幕.setBounds(820, 22, 72, 22);
		_屏幕.setText("显示屏幕");
	}

	public void createContents(Composite composite) {
	}

	public void createListenter() {
		_保存订单.addListener(SWT.Selection, new Listener() {
			public void handleEvent(Event arg0) {
				OrderModel order = new OrderModel();
				order.setName(_名称.getText());
				if (StringUtils.isBlank(order.getName())) {
					MessageBox2.showErrorMsg("姓名必填");
					return;
				}
				try {
					order.setQuantity(Long.valueOf(_订单数.getText()));
				} catch (Exception e) {
					MessageBox2.showErrorMsg("数量填写错误");
					return;
				}
				List<OrderModel> orders = CacheUtils.get(CacheUtils._订单);
				if (orders == null) {
					orders = new ArrayList<OrderModel>();
				}

				order.setCreateTime(new Date());

				orders.add(order);
				CacheUtils.add(CacheUtils._订单, orders);
				query(1);
				if (_屏幕view.dialogshell != null && !_屏幕view.dialogshell.isDisposed()) {
					_屏幕view.D();
				}
				clearText();
			}
		});
		_屏幕.addListener(SWT.Selection, new Listener() {
			public void handleEvent(Event arg0) {
				if ("显示屏幕".equals(_屏幕.getText())) {
					_屏幕.setText("关闭屏幕");
					_屏幕view.open();
				} else {
					_屏幕.setText("显示屏幕");
					_屏幕view.close();
				}
			}
		});
	}

	public void preHandle() {

	}

	public void fullContents(Object... values) {
		query(1);
	}

	public Pagination query(Integer pageNo) {
		List<OrderModel> list = CacheUtils.get(CacheUtils._订单);
		if (list != null) {
			Collections.sort(list, new Comparator() {
				public int compare(Object _o1, Object _o2) {
					OrderModel p1 = (OrderModel) _o1;
					OrderModel p2 = (OrderModel) _o2;
					if (p1.getQuantity().equals(p2.getQuantity())) {
						return p1.getCreateTime().compareTo(p2.getCreateTime());
					}
					return p2.getQuantity().compareTo(p1.getQuantity());
				}
			});
			tableView.fullContents(list);
		}
		return new Pagination();
	}

	public void setValue(String name, String view) {
	}

	public void clearText() {
		_订单数.setText("");
		_名称.setText("");
	}
}
