package com.uservoice.uservoicesdk.dialog;

import android.annotation.SuppressLint;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.os.Bundle;
import android.webkit.WebView;

import com.uservoice.uservoicesdk.R;
import com.uservoice.uservoicesdk.model.Article;
import com.uservoice.uservoicesdk.ui.WebViews;

@SuppressLint("ValidFragment")
public class ArticleDialogFragment extends DialogFragment {
	
	private final Article article;

	public ArticleDialogFragment(Article article) {
		this.article = article;
	}

	@Override
	public Dialog onCreateDialog(Bundle savedInstanceState) {
		AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
		builder.setTitle(R.string.article_instant_answer_question);
		
		WebView webView = new WebView(getActivity());
		builder.setView(webView);
		WebViews.displayArticle(webView, article);
		
		builder.setNegativeButton(R.string.no, new DialogInterface.OnClickListener() {
			@Override
			public void onClick(DialogInterface dialog, int which) {
			}
		});
		
		builder.setPositiveButton(R.string.yes, new DialogInterface.OnClickListener() {
			@Override
			public void onClick(DialogInterface dialog, int which) {
			}
		});
		
		return builder.create();
	}
}
