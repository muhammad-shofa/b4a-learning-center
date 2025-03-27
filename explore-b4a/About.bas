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
End Sub

Sub Activity_Create(FirstTime As Boolean)
	Activity.LoadLayout("AboutUI")
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