package com.broadcast.view;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

import com.broadcast.cache.model._排名Model;
import com.broadcast.view.base.IBaseView;

public class _第一名View implements IBaseView {

	
	public static _第一名View _第一名View=new _第一名View();
	
	private Text _姓名_宽度;
	private Text _姓名_高度;
	private Text _姓名_左边;
	private Text _姓名_上边;
	private Text _姓名_字体大小;
	private Text _姓名_颜色;
	private Text _数量_宽度;
	private Text _数量_高度;
	private Text _数量_左边;
	private Text _数量_上边;
	private Text _数量_字体大小;
	private Text _数量_颜色;

	public void createContents(Shell shell) {

	}

	public void createContents(Composite composite) {
		Group g_第一名 = new Group(composite, SWT.NONE);
		g_第一名.setText("第一名");
		g_第一名.setBounds(0, 104, 886, 36);

		Label lblNewLabel_5 = new Label(g_第一名, SWT.NONE);
		lblNewLabel_5.setBounds(56, 14, 29, 16);
		lblNewLabel_5.setText("姓名");

		_姓名_宽度 = new Text(g_第一名, SWT.BORDER);
		_姓名_宽度.setBounds(93, 13, 40, 18);

		_姓名_高度 = new Text(g_第一名, SWT.BORDER);
		_姓名_高度.setBounds(150, 13, 40, 18);

		_姓名_左边 = new Text(g_第一名, SWT.BORDER);
		_姓名_左边.setBounds(216, 13, 40, 18);

		_姓名_上边 = new Text(g_第一名, SWT.BORDER);
		_姓名_上边.setBounds(276, 13, 40, 18);

		_姓名_字体大小 = new Text(g_第一名, SWT.BORDER);
		_姓名_字体大小.setBounds(327, 13, 40, 18);

		_姓名_颜色 = new Text(g_第一名, SWT.BORDER);
		_姓名_颜色.setBounds(386, 13, 40, 18);

		Label label_10 = new Label(g_第一名, SWT.NONE);
		label_10.setText("数量");
		label_10.setBounds(506, 14, 31, 16);

		_数量_宽度 = new Text(g_第一名, SWT.BORDER);
		_数量_宽度.setBounds(543, 13, 40, 18);

		_数量_高度 = new Text(g_第一名, SWT.BORDER);
		_数量_高度.setBounds(600, 13, 40, 18);

		_数量_左边 = new Text(g_第一名, SWT.BORDER);
		_数量_左边.setBounds(666, 13, 40, 18);

		_数量_上边 = new Text(g_第一名, SWT.BORDER);
		_数量_上边.setBounds(726, 13, 40, 18);

		_数量_字体大小 = new Text(g_第一名, SWT.BORDER);
		_数量_字体大小.setBounds(777, 13, 40, 18);

		_数量_颜色 = new Text(g_第一名, SWT.BORDER);
		_数量_颜色.setBounds(836, 13, 40, 18);
	}

	public void createListenter() {

	}

	public void preHandle() {

	}

	public void fullContents(Object... values) {
		if (values == null || values.length == 0) {
			return;
		}
		_排名Model _0 = (_排名Model) values[0];
		if (_0 != null) {
			if (_0.getWidth() != null) {
				_姓名_宽度.setText(_0.getWidth().toString());
			}
			if (_0.getHeight() != null) {
				_姓名_高度.setText(_0.getHeight().toString());
			}
			if (_0.getLeft() != null) {
				_姓名_左边.setText(_0.getLeft().toString());
			}
			if (_0.getTop() != null) {
				_姓名_上边.setText(_0.getTop().toString());
			}
			if (_0.getFontSize() != null) {
				_姓名_字体大小.setText(_0.getFontSize().toString());
			}
			_姓名_颜色.setText(_0.getRgb());
		}
		_排名Model _1 = (_排名Model) values[1];
		if (_1 != null) {
			if (_1.getWidth() != null) {
				_数量_宽度.setText(_1.getWidth().toString());
			}
			if (_1.getHeight() != null) {
				_数量_高度.setText(_1.getHeight().toString());
			}
			if (_1.getLeft() != null) {
				_数量_左边.setText(_1.getLeft().toString());
			}
			if (_1.getTop() != null) {
				_数量_上边.setText(_1.getTop().toString());
			}
			if (_1.getFontSize() != null) {
				_数量_字体大小.setText(_1.getFontSize().toString());
			}
			_数量_颜色.setText(_1.getRgb());
		}
	}

	public _排名Model[] getPropertys() {
		return new _排名Model[] {
				new _排名Model(Integer.valueOf(_姓名_宽度.getText()),
						Integer.valueOf(_姓名_高度.getText()),
						Integer.valueOf(_姓名_左边.getText()),
						Integer.valueOf(_姓名_上边.getText()),
						Integer.valueOf(_姓名_字体大小.getText()), _姓名_颜色.getText()),
				new _排名Model(Integer.valueOf(_数量_宽度.getText()),
						Integer.valueOf(_数量_高度.getText()),
						Integer.valueOf(_数量_左边.getText()),
						Integer.valueOf(_数量_上边.getText()),
						Integer.valueOf(_数量_字体大小.getText()), _数量_颜色.getText()) };
	}
}
