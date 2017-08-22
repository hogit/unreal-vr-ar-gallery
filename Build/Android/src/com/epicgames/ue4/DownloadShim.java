package com.epicgames.ue4;

import com.Hogben.UnrealVrArGallery.OBBDownloaderService;
import com.Hogben.UnrealVrArGallery.DownloaderActivity;


public class DownloadShim
{
	public static OBBDownloaderService DownloaderService;
	public static DownloaderActivity DownloadActivity;
	public static Class<DownloaderActivity> GetDownloaderType() { return DownloaderActivity.class; }
}

