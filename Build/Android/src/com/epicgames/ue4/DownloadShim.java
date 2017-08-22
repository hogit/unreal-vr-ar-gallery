package com.epicgames.ue4;

import com.Hogben.Gallery.OBBDownloaderService;
import com.Hogben.Gallery.DownloaderActivity;


public class DownloadShim
{
	public static OBBDownloaderService DownloaderService;
	public static DownloaderActivity DownloadActivity;
	public static Class<DownloaderActivity> GetDownloaderType() { return DownloaderActivity.class; }
}

