package com.broadcast.view;

import static com.broadcast.view._背景色View._背景色View;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang.StringUtils;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.eclipse.wb.swt.ResourceUtils;

import com.broadcast.cache.model._屏幕Model;
import com.broadcast.view.base.IBaseView;

public class _屏幕设置View implements IBaseView {

	public static _屏幕设置View _屏幕设置View = new _屏幕设置View();

	private Text _宽度;
	private Text _高度;
	private Button _背景图;

	public void createContents(Shell shell) {
	}

	public void createContents(final Composite composite) {
		Group group = new Group(composite, SWT.NONE);
		group.setText("屏幕设置");
		group.setBounds(0, 0, 886, 76);

		_高度 = new Text(group, SWT.BORDER);
		_高度.setBounds(220, 34, 70, 18);

		Label lblNewLabel_4 = new Label(group, SWT.NONE);
		lblNewLabel_4.setBounds(160, 36, 54, 12);
		lblNewLabel_4.setText("背景高度：");

		_宽度 = new Text(group, SWT.BORDER);
		_宽度.setBounds(70, 34, 70, 18);

		Label lblNewLabel_3 = new Label(group, SWT.NONE);
		lblNewLabel_3.setBounds(10, 36, 54, 12);
		lblNewLabel_3.setText("背景宽度：");

		_背景图 = new Button(group, SWT.None);
		_背景图.setBounds(780, 9, 96, 64);
		_背景图.setText("背景图");
	}

	public void createListenter() {
		_背景图.addListener(SWT.Selection, new Listener() {
			public void handleEvent(Event arg0) {
				FileDialog dialog = new FileDialog(_背景图.getShell(), SWT.OPEN);
				dialog.setText("请选择背景图片");// 设置对话框的标题
				dialog.setFilterNames(new String[] { "图片文件 (*.jpg)",
						"所有文件(*.*)" });// 设置扩展名
				dialog.setFilterExtensions(new String[] { "*.jpg", "*.*" });// 设置文件扩展名
				filename = dialog.open();
				if (StringUtils.isBlank(filename)) {
					return;
				}
				Image image = ResourceUtils.getImageByName(filename);
				if (image == null) {
					return;
				}
				_背景图.setImage(new Image(null, image.getImageData().scaledTo(
						_背景图.getSize().x, _背景图.getSize().y)));
				_背景色View.fullContents(ResourceUtils.getImageGRB(image));
			}
		});
	}

	private String filename;

	public void preHandle() {

	}

	public void fullContents(Object... values) {
		_屏幕Model model = (_屏幕Model) values[0];
		if (model == null) {
			return;
		}
		if (model.getHeidht() != null) {
			_高度.setText(model.getHeidht().toString());
		}
		if (model.getWidth() != null) {
			_宽度.setText(model.getWidth().toString());
		}

		Image image = ResourceUtils.getImage();

		if (image != null) {
			_背景图.setImage(new Image(null, image.getImageData().scaledTo(
					_背景图.getSize().x, _背景图.getSize().y)));
			_背景图.setData(image);
		}
	}

	public void copyFile() {
		try {
			if (filename != null) {
				FileUtils.copyFile(
						new File(filename),
						new File(ResourceUtils
								.getResource(ResourceUtils.DEFAULT_NAME)));
			}
		} catch (IOException e) {
			throw new IllegalStateException(e.getMessage(), e);
		}
	}

	public _屏幕Model getProperty() {
		return new _屏幕Model(Integer.valueOf(_宽度.getText()), Integer.valueOf(_高度
				.getText()),
				ResourceUtils.getImageGRB(ResourceUtils.getImage()));
	}
}
