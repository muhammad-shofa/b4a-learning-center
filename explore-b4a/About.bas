B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Activity
Version=13.1
@EndOfDesignText@
#Region  Activity Attributes 
	#FullScreen: False
	#IncludeTitle: True
#End Region

Sub Process_Globals
	'These global variables will be declared once when the application starts.
	'These variables can be accessed from all modules.

End Sub

Sub Globals
	'These global variables will be redeclared each time the activity is created.
	'These variables can only be accessed from this module.

	Private LblAbout1 As Label
	Private BtnToAbout1 As Button
	Private BtnToHome1 As Button
	Private EditText1 As EditText
	Private HZ_ScrollView1 As HorizontalScrollView
End Sub

Sub Activity_Create(FirstTime As Boolean)
	Activity.LoadLayout("AboutUI")
	
	'Buat Panel baru dan tambahkan ke dalam Horizontal Scroll View
	Dim Panel1 As Panel
	Panel1.Initialize("")
	HZ_ScrollView1.Panel.AddView(Panel1, 0, 0, 600dip, 100dip) 'lebah lebih besar dari HSV agar bisa discroll
	
	'Tampilkan content di dalam HSV menggunakan perulangan for
	For i = 0 To 4
		Dim LblContentHSV As Label
		LblContentHSV.Initialize("")
		LblContentHSV.Text = "Halo" & (i + 1)
		LblContentHSV.TextColor = Colors.Black
		
		'Menambahkan label kedalam panel yang sudah dibuat
		Panel1.AddView(LblContentHSV, i * 100dip, 0, 100dip, 100dip)
	Next
	
	'Atur lebar dan tinggi panel didalam horizontal scroll view
	HZ_ScrollView1.Panel.Width = 600dip
	HZ_ScrollView1.Panel.Height = 100dip
End Sub

Sub Activity_Resume

End Sub

Sub Activity_Pause (UserClosed As Boolean)

End Sub

Sub BtnToHome1_Click
	StartActivity("Main")
End Sub

Sub BtnToAbout1_Click
	StartActivity("About")
End Sub