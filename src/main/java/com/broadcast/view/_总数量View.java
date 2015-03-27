package com.broadcast.view;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

import com.broadcast.cache.model._排名Model;
import com.broadcast.view.base.IBaseView;

public class _总数量View implements IBaseView {

	public static _总数量View _总数量View = new _总数量View();

	private Text _总人数_宽度;
	private Text _总人数_高度;
	private Text _总人数_左边;
	private Text _总人数_上边;
	private Text _总人数_字体大小;
	private Text _总人数_颜色;
	private Text _数量_宽度;
	private Text _数量_高度;
	private Text _数量_左边;
	private Text _数量_上边;
	private Text _数量_字体大小;
	private Text _数量_颜色;

	public void createContents(Shell shell) {
		// TODO Auto-generated method stub

	}

	public void createContents(Composite composite) {

		Group group_10 = new Group(composite, SWT.NONE);
		group_10.setText("总数量");
		group_10.setBounds(0, 426, 886, 36);

		Label lblNewLabel_5 = new Label(group_10, SWT.NONE);
		lblNewLabel_5.setBounds(56, 14, 29, 16);
		lblNewLabel_5.setText("人数");

		_总人数_宽度 = new Text(group_10, SWT.BORDER);
		_总人数_宽度.setBounds(93, 13, 40, 18);

		_总人数_高度 = new Text(group_10, SWT.BORDER);
		_总人数_高度.setBounds(150, 13, 40, 18);

		_总人数_左边 = new Text(group_10, SWT.BORDER);
		_总人数_左边.setBounds(216, 13, 40, 18);

		_总人数_上边 = new Text(group_10, SWT.BORDER);
		_总人数_上边.setBounds(276, 13, 40, 18);

		_总人数_字体大小 = new Text(group_10, SWT.BORDER);
		_总人数_字体大小.setBounds(327, 13, 40, 18);

		_总人数_颜色 = new Text(group_10, SWT.BORDER);
		_总人数_颜色.setBounds(386, 13, 40, 18);

		Label label_28 = new Label(group_10, SWT.NONE);
		label_28.setText("数量");
		label_28.setBounds(506, 14, 31, 16);

		_数量_宽度 = new Text(group_10, SWT.BORDER);
		_数量_宽度.setBounds(543, 13, 40, 18);

		_数量_高度 = new Text(group_10, SWT.BORDER);
		_数量_高度.setBounds(600, 13, 40, 18);

		_数量_左边 = new Text(group_10, SWT.BORDER);
		_数量_左边.setBounds(666, 13, 40, 18);

		_数量_上边 = new Text(group_10, SWT.BORDER);
		_数量_上边.setBounds(726, 13, 40, 18);

		_数量_字体大小 = new Text(group_10, SWT.BORDER);
		_数量_字体大小.setBounds(777, 13, 40, 18);

		_数量_颜色 = new Text(group_10, SWT.BORDER);
		_数量_颜色.setBounds(836, 13, 40, 18);
	}

	public void createListenter() {

	}

	public void preHandle() {
		// TODO Auto-generated method stub

	}

	public void fullContents(Object... values) {
		if (values == null || values.length == 0) {
			return;
		}
		_排名Model _0 = (_排名Model) values[0];
		if (_0 != null) {
			if (_0.getWidth() != null) {
				_总人数_宽度.setText(_0.getWidth().toString());
			}
			if (_0.getHeight() != null) {
				_总人数_高度.setText(_0.getHeight().toString());
			}
			if (_0.getLeft() != null) {
				_总人数_左边.setText(_0.getLeft().toString());
			}
			if (_0.getTop() != null) {
				_总人数_上边.setText(_0.getTop().toString());
			}
			if (_0.getFontSize() != null) {
				_总人数_字体大小.setText(_0.getFontSize().toString());
			}
			_总人数_颜色.setText(_0.getRgb());
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
				new _排名Model(Integer.valueOf(_总人数_宽度.getText()),
						Integer.valueOf(_总人数_高度.getText()),
						Integer.valueOf(_总人数_左边.getText()),
						Integer.valueOf(_总人数_上边.getText()),
						Integer.valueOf(_总人数_字体大小.getText()), _总人数_颜色.getText()),
				new _排名Model(Integer.valueOf(_数量_宽度.getText()),
						Integer.valueOf(_数量_高度.getText()),
						Integer.valueOf(_数量_左边.getText()),
						Integer.valueOf(_数量_上边.getText()),
						Integer.valueOf(_数量_字体大小.getText()), _数量_颜色.getText()) };
	}
}
