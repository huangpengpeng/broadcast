package com.broadcast.view.order;

import static com.broadcast.view.MainView.composite;

import java.util.List;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Table;

import com.broadcast.cache.CacheUtils;
import com.broadcast.cache.model.OrderModel;
import com.broadcast.view.base.Column;
import com.broadcast.view.base.Column.Listener;
import com.broadcast.view.base.IMainView.MessageBox2;
import com.broadcast.view.base.ITableView;

import static com.broadcast.view._屏幕view._屏幕view;
import static com.broadcast.view.order.OrderSearchView.searchView;

public class OrderTableView extends ITableView {

	public static OrderTableView tableView = new OrderTableView();

	private Table table;

	public void createListenter() {
	}

	public void preHandle() {
		table = new Table(composite, SWT.BORDER | SWT.FULL_SELECTION);
		table.setBounds(0, 0, 886, 500);
		table.setHeaderVisible(true);
		table.setLinesVisible(true);
	}

	@Override
	protected Column[] getColumns() {
		return new Column[] {
				new Column("name", "姓名", 365, Column.PUTONG),
				new Column("quantity", "数量", 400, Column.PUTONG),
				new Column(null, "操作", 100, Column.BUTTON, "删除",
						new Listener() {
							public void handleEvent(Event arg0) {
								if (!MessageBox2.isOk("确认删除？")) {
									return;
								}
								OrderModel model = (OrderModel) arg0.widget
										.getData();
								List<?> orders = CacheUtils.get(CacheUtils._订单);
								orders.remove(model);
								CacheUtils.add(CacheUtils._订单, orders);
								searchView.query(1);
								if (_屏幕view.dialogshell != null
										&& !_屏幕view.dialogshell.isDisposed()) {
									_屏幕view.D();
								}
							}
						}) };
	}

	@Override
	protected Table getTable() {
		return table;
	}

	@Override
	protected Integer getHeight() {
		return 20;
	}
}
