﻿<概要>
DDRのハイスピードを一括で計算してくれます。2つまで同時に計算可能。

<使い方>
・MainBPMまたはSubBPMにBPMを入力します。
・[計算]をタップするします。
・x0.25からx8.0まで計算してくれます。
・[クリア]を押すと入力をリセットします。
・計算結果が表示しきれていない場合はスクロールさせることができます。

<仕様・機能>
・3入力は使用頻度低と判断し未実装
・未入力は0扱い（nullエラー回避）片方のみ入力にも対応
・4桁まで入力可（0~9999）
・計算結果をスクロール可能にし非縦長スマホにも対応（旧スマホ対応策　タブレットも動作可能だが問題点あり）
・クリアボタンで数値削除（再計算に便利）
・終了確認ダイアログ（誤タップ防止）
・縦画面固定

<問題点>
・textbox選択時、結果部分（scrollview）をタップしても選択解除できない（focusが外れない）
	→scrollviewより上部分タップで対処してください。
・タブレット等では高さ調整はされずスペースが余る
