package com.broadcast.view;

import static com.broadcast.view._屏幕view._屏幕view;
import static com.broadcast.view._屏幕设置View._屏幕设置View;
import static com.broadcast.view._总数量View._总数量View;
import static com.broadcast.view._第一名View._第一名View;
import static com.broadcast.view._第七名View._第七名View;
import static com.broadcast.view._第三名View._第三名View;
import static com.broadcast.view._第九名View._第九名View;
import static com.broadcast.view._第二名View._第二名View;
import static com.broadcast.view._第五名View._第五名View;
import static com.broadcast.view._第八名View._第八名View;
import static com.broadcast.view._第六名View._第六名View;
import static com.broadcast.view._第四名View._第四名View;
import static com.broadcast.view._背景色View._背景色View;
import static com.broadcast.view.order.OrderSearchView.searchView;
import static com.broadcast.view.order.OrderTableView.tableView;

import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.CLabel;
import org.eclipse.swt.custom.CTabFolder;
import org.eclipse.swt.custom.CTabItem;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Shell;

import com.broadcast.cache.CacheUtils;
import com.broadcast.cache.model._屏幕Model;
import com.broadcast.view.base.IMainView;

public class MainView extends IMainView {

	public static Composite composite;

	private Button _全部保存;

	/**
	 * Launch the application.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		MainView window = new MainView();
		window.load();
	}

	@Override
	public void createShell() {
		shell = new Shell(SWT.BORDER | SWT.MIN);
		shell.setSize(900, 600);
		shell.setText("订单播报");
	}

	@Override
	public String getApplicationXml() {
		return null;
	}

	@Override
	public void createContents() {

		View.addView(_背景色View);
		_屏幕Model _屏幕Model = CacheUtils.get(CacheUtils._屏幕);
		if (_屏幕Model != null) {
			_背景色View.fullContents(_屏幕Model.getRgb());
		}

		CTabFolder tabFolder = new CTabFolder(shell, SWT.BORDER);
		tabFolder.setBounds(0, 47, 892, 529);
		tabFolder.setSelectionBackground(Display.getCurrent().getSystemColor(
				SWT.COLOR_TITLE_INACTIVE_BACKGROUND_GRADIENT));

		CTabItem tbtmNewItem = new CTabItem(tabFolder, SWT.NONE);
		tbtmNewItem.setText("订单列表");

		composite = new Composite(tabFolder, SWT.NONE);
		tbtmNewItem.setControl(composite);

		View.addView(composite, tableView);
		View.addView(composite, searchView);
		searchView.fullContents(null);

		CTabItem tabItem_1 = new CTabItem(tabFolder, SWT.NONE);
		tabItem_1.setText("显示屏设置");

		Composite composite_1 = new Composite(tabFolder, SWT.NONE);
		tabItem_1.setControl(composite_1);

		View.addView(composite_1, _屏幕设置View);
		_屏幕设置View.fullContents(CacheUtils.get(CacheUtils._屏幕));

		CLabel lblNewLabel_6 = new CLabel(composite_1, SWT.NONE);
		lblNewLabel_6.setAlignment(SWT.CENTER);
		lblNewLabel_6.setBounds(80, 80, 52, 18);
		lblNewLabel_6.setText("宽度");

		CLabel label = new CLabel(composite_1, SWT.NONE);
		label.setText("高度");
		label.setAlignment(SWT.CENTER);
		label.setBounds(138, 80, 52, 18);

		CLabel label_1 = new CLabel(composite_1, SWT.NONE);
		label_1.setText("左边");
		label_1.setAlignment(SWT.CENTER);
		label_1.setBounds(204, 80, 52, 18);

		CLabel label_2 = new CLabel(composite_1, SWT.NONE);
		label_2.setText("上边");
		label_2.setAlignment(SWT.CENTER);
		label_2.setBounds(262, 80, 52, 18);

		CLabel label_3 = new CLabel(composite_1, SWT.NONE);
		label_3.setText("字体大小");
		label_3.setAlignment(SWT.CENTER);
		label_3.setBounds(318, 80, 52, 18);

		CLabel lblgbk = new CLabel(composite_1, SWT.NONE);
		lblgbk.setText("颜色|背景色");
		lblgbk.setAlignment(SWT.CENTER);
		lblgbk.setBounds(376, 80, 52, 18);

		CLabel label_4 = new CLabel(composite_1, SWT.NONE);
		label_4.setText("宽度");
		label_4.setAlignment(SWT.CENTER);
		label_4.setBounds(528, 80, 52, 18);

		CLabel label_5 = new CLabel(composite_1, SWT.NONE);
		label_5.setText("高度");
		label_5.setAlignment(SWT.CENTER);
		label_5.setBounds(586, 80, 52, 18);

		CLabel label_6 = new CLabel(composite_1, SWT.NONE);
		label_6.setText("左边");
		label_6.setAlignment(SWT.CENTER);
		label_6.setBounds(652, 80, 52, 18);

		CLabel label_7 = new CLabel(composite_1, SWT.NONE);
		label_7.setText("上边");
		label_7.setAlignment(SWT.CENTER);
		label_7.setBounds(710, 80, 52, 18);

		CLabel label_8 = new CLabel(composite_1, SWT.NONE);
		label_8.setText("字体大小");
		label_8.setAlignment(SWT.CENTER);
		label_8.setBounds(766, 80, 52, 18);

		CLabel label_9 = new CLabel(composite_1, SWT.NONE);
		label_9.setText("颜色|背景色");
		label_9.setAlignment(SWT.CENTER);
		label_9.setBounds(824, 80, 52, 18);

		View.addView(composite_1, _第一名View);
		_第一名View.fullContents(CacheUtils.get(CacheUtils._第一名_姓名),
				CacheUtils.get(CacheUtils._第一名_数量));

		View.addView(composite_1, _第二名View);
		_第二名View.fullContents(CacheUtils.get(CacheUtils._第二名_姓名),
				CacheUtils.get(CacheUtils._第二名_数量));

		View.addView(composite_1, _第三名View);
		_第三名View.fullContents(CacheUtils.get(CacheUtils._第三名_姓名),
				CacheUtils.get(CacheUtils._第三名_数量));

		View.addView(composite_1, _第四名View);
		_第四名View.fullContents(CacheUtils.get(CacheUtils._第四名_姓名),
				CacheUtils.get(CacheUtils._第四名_数量));

		View.addView(composite_1, _第五名View);
		_第五名View.fullContents(CacheUtils.get(CacheUtils._第五名_姓名),
				CacheUtils.get(CacheUtils._第五名_数量));

		View.addView(composite_1, _第六名View);
		_第六名View.fullContents(CacheUtils.get(CacheUtils._第六名_姓名),
				CacheUtils.get(CacheUtils._第六名_数量));

		View.addView(composite_1, _第七名View);
		_第七名View.fullContents(CacheUtils.get(CacheUtils._第七名_姓名),
				CacheUtils.get(CacheUtils._第七名_数量));

		View.addView(composite_1, _第八名View);
		_第八名View.fullContents(CacheUtils.get(CacheUtils._第八名_姓名),
				CacheUtils.get(CacheUtils._第八名_数量));

		View.addView(composite_1, _第九名View);
		_第九名View.fullContents(CacheUtils.get(CacheUtils._第九名_姓名),
				CacheUtils.get(CacheUtils._第九名_数量));

		View.addView(composite_1, _总数量View);
		_总数量View.fullContents(CacheUtils.get(CacheUtils._总人数),
				CacheUtils.get(CacheUtils._总数量));

		_全部保存 = new Button(composite_1, SWT.NONE);
		_全部保存.setBounds(796, 468, 80, 26);
		_全部保存.setText("全部保存");
		_全部保存.addListener(SWT.Selection, new Listener() {
			public void handleEvent(Event arg0) {
				try {
					CacheUtils.add(CacheUtils._第一名_姓名,
							_第一名View.getPropertys()[0]);
					CacheUtils.add(CacheUtils._第一名_数量,
							_第一名View.getPropertys()[1]);

					CacheUtils.add(CacheUtils._第二名_姓名,
							_第二名View.getPropertys()[0]);
					CacheUtils.add(CacheUtils._第二名_数量,
							_第二名View.getPropertys()[1]);

					CacheUtils.add(CacheUtils._第三名_姓名,
							_第三名View.getPropertys()[0]);
					CacheUtils.add(CacheUtils._第三名_数量,
							_第三名View.getPropertys()[1]);

					CacheUtils.add(CacheUtils._第四名_姓名,
							_第四名View.getPropertys()[0]);
					CacheUtils.add(CacheUtils._第四名_数量,
							_第四名View.getPropertys()[1]);

					CacheUtils.add(CacheUtils._第五名_姓名,
							_第五名View.getPropertys()[0]);
					CacheUtils.add(CacheUtils._第五名_数量,
							_第五名View.getPropertys()[1]);

					CacheUtils.add(CacheUtils._第六名_姓名,
							_第六名View.getPropertys()[0]);
					CacheUtils.add(CacheUtils._第六名_数量,
							_第六名View.getPropertys()[1]);

					CacheUtils.add(CacheUtils._第七名_姓名,
							_第七名View.getPropertys()[0]);
					CacheUtils.add(CacheUtils._第七名_数量,
							_第七名View.getPropertys()[1]);

					CacheUtils.add(CacheUtils._第八名_姓名,
							_第八名View.getPropertys()[0]);
					CacheUtils.add(CacheUtils._第八名_数量,
							_第八名View.getPropertys()[1]);

					CacheUtils.add(CacheUtils._第九名_姓名,
							_第九名View.getPropertys()[0]);
					CacheUtils.add(CacheUtils._第九名_数量,
							_第九名View.getPropertys()[1]);

					_屏幕设置View.copyFile();

					CacheUtils.add(CacheUtils._总人数, _总数量View.getPropertys()[0]);
					CacheUtils.add(CacheUtils._总数量, _总数量View.getPropertys()[1]);

					CacheUtils.add(CacheUtils._屏幕, _屏幕设置View.getProperty());

					if (_屏幕view.dialogshell != null
							&& !_屏幕view.dialogshell.isDisposed()) {
						_屏幕view.P();
					}
				} catch (Exception e) {
					e.printStackTrace();
					MessageBox2.showErrorMsg("输入信息有误", e);
				}
			}
		});
	}
}
