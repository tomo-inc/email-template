package app.unyx.appcore.common;

import java.math.BigDecimal;
import java.util.Set;

public class Constants {
    public static final String TOMO_THEME = "#F21F7F";
    public static final String TOMO_LOGO = "https://pub.tomo.inc/TomoLogo.png";
    public static final String JWT_COOKIE_KEY = "access-token";
    public static final String JWT_HEADER_PREFIX = "Bearer ";
    public static final String OPEN_API_HEADER_PREFIX = "Bearer ";
    public static final String OPEN_API_HEADER_NONCE = "nonce";
    public static final String OPEN_API_HEADER_TIMESTAMP = "timestamp";

    public static final String OPEN_API_SIGN_MESSAGE_PREFIX = "tomo open api ";
    public static final Long OPEN_API_SIGN_VALID_TIME = 5 * 60 * 1000L;

    public static final String SIG_LOGIN_MESSAGE_PREFIX = "tomo sign login ";
    public static final Long SIGN_VALID_TIME = 5 * 60 * 1000L;

    public static final String EMAIL_TITLE_VERIFICATION_CODE = "Verification Code";
    public static final String EMAIL_TITLE_RECOVER_URL = "Request to export seed phrase(s)";
    public static final String EMAIL_TITLE_SECURITY_ALERT = "Security Alert";
    public static final String EMAIL_INIT_EXPORT_CODE = "Init Export Mnemonic Verification Code";
    public static final String VERIFICATION_CODE_EMAIL_TEMPLATE_HINT = "CODE_HINT";
    public static final String VERIFICATION_SDK_CODE_EMAIL_TEMPLATE_HINT_NAME = "NAME_HINT";
    public static final String VERIFICATION_SDK_CODE_EMAIL_TEMPLATE_HINT_LOGO = "LOGO_HINT";
    public static final String VERIFICATION_SDK_CODE_EMAIL_TEMPLATE_HINT_COLOR = "COLOR_HINT";
    public static final String VERIFICATION_SDK_CODE_EMAIL_TEMPLATE_HINT_RECOVER_URL = "RECOVER_URL_HINT";
    public static final String EMAIL_SDK_TITLE_VERIFICATION_CODE = VERIFICATION_SDK_CODE_EMAIL_TEMPLATE_HINT_NAME + "'s Verification Code";



    public static final String EMAIL_VERIFICATION_CODE_SUBJECT = "Init Export Secret";

//    public static final String VERIFICATION_CODE_EMAIL_TEMPLATE = "<!DOCTYPE html>\n" +
//            "<html lang=\"en\" class=\"notranslate\" translate=\"no\">\n" +
//            "  <body>\n" +
//            "    <div style=\"width: 100%;height: auto;\">\n" +
//            "        <div style=\"margin: auto; width: 256px; padding-top: 32px; padding-bottom: 32px;\">\n" +
//            "            <div>Your Verification code is:</div>\n" +
//            "            <div style=\"background-color: #EAF2FF; border-radius: 8px; text-align: center; font-weight: 700; font-size: 32px; margin-top: 24px; margin-bottom: 24px;\">"
//            + VERIFICATION_CODE_EMAIL_TEMPLATE_HINT + "</div>\n" +
//            "            <a href=\"https://tomo.inc\" style=\"text-align: center; margin-top: 32px;\">Tomo.inc</a>\n" +
//            "            <div style=\"margin-top: 2px;\">\n" +
//            "                <a href=\"https://twitter.com/tomo_social\" style=\"text-align: center; display: inline-block;\">Twitter</a>\n"
//            +
//            "                <a href=\"https://t.me/tomoinc\" style=\"text-align: center; display: inline-block;\">Telegram</a>\n"
//            +
//            "                <a href=\"https://www.instagram.com/tomoinc\" style=\"text-align: center; display: inline-block;\">Instagram</a>\n"
//            +
//            "            </div>\n" +
//            "        </div>\n" +
//            "    </div>\n" +
//            "  </body>\n" +
//            "</html>\n";

    public static final String VERIFICATION_URL_EMAIL_TEMPLATE_SDK = """
            <!doctype html>
            <html lang="en">
            <head>
                <meta charset="UTF-8" />
                <meta name="viewport" content="width=device-width, initial-scale=1.0" />
                <title>Request to export seed phrase(s)</title>
            </head>
            <body style="background: rgba(235, 236, 241, 1);margin: 0;">
            <div>
                <div style="background: #ffffff;border: 1px solid rgba(226, 227, 240, 1);margin: 10px;border-radius: 2px;overflow: hidden;text-align: left;padding-bottom: 25px;">
                    <div style="padding: 18px;margin: 0 40px;border-bottom: 1px solid rgba(145, 158, 171, 0.2);">
                        <table style="width: 100%">
                            <tr>
                                <td style="text-align: center; vertical-align: middle;">
                                    <img src="LOGO_HINT" alt="Logo" style="width: 100px">
                                </td>
                            </tr>
                        </table>
                    </div>
                    <div style="padding: 40px 40px 30px;margin: 0 40px;">
                    <div style="font-size: 20px;font-weight: 700;">
                        Request to export seed phrase(s)
                    </div>
                    <div style="font-weight: 400;font-size: 14px;color: rgba(25, 25, 25, 0.9);line-height: 1.8;margin: 10px 0 0;">
                        We received a request to export your seed phrase(s). To
                        proceed, please click the link below:
                    </div>
                    <div style="word-break: break-all;font-size: 12px;font-weight: 400;margin: 20px 0 30px;">
                        <a style="color: #0094ff" target="_blank" href="RECOVER_URL_HINT">RECOVER_URL_HINT</a>
                    </div>
                    <div style="font-size: 12px; font-weight: 400;color: rgba(99, 115, 129, 1);">
                        For your security, please keep this information
                        confidential and <strong>DO NOT SHARE</strong> it with
                        anyone, including <strong>customer service</strong>.
                    </div>
                </div>
                <div style="font-size: 12px;font-weight: 400;color: rgba(99, 115, 129, 1);text-align: center;border-top: 1px solid rgba(145, 158, 171, 0.2);padding: 20px 0 30px;">
                    If you have any questions, reach out to our support team at
                    support@tomo.inc
                </div>
                <div style="font-weight: 400;font-size: 12px;line-height: 17px;color: rgba(137, 137, 171, 1);text-align: center">
                    <table style="width: 120px; margin: 0 auto;">
                        <tr>
                            <td style="text-align: center; vertical-align: middle;">
                                <div style="margin-right: 4px;">Powered by</div>
                            </td>
                            <td style="width: 37px">
                                <img src="https://pub.tomo.inc/public/tomo_power.jpeg" alt="Logo" width="37px">
                            </td>
                        </tr>
                    </table>
                </div>
            </div>
            </div>
            </body>
            </html>
            """;

    public static final String VERIFICATION_CODE_EMAIL_TEMPLATE_SDK = """
            <!doctype html>
            <html lang="en">
            <head>
                <meta charset="UTF-8" />
                <meta name="viewport" content="width=device-width, initial-scale=1.0" />
                <title>Verify your email</title>
            </head>
            <body style="background: rgba(235, 236, 241, 1);margin: 0;">
            <div>
                <div style="background: #ffffff;border: 1px solid rgba(226, 227, 240, 1);margin: 10px;border-radius: 2px;overflow: hidden;text-align: left;padding-bottom: 25px;">
                <div style="padding: 18px;margin: 0 40px;border-bottom: 1px solid rgba(145, 158, 171, 0.2);">
                    <table style="width: 100%">
                        <tr>
                            <td style="text-align: center; vertical-align: middle;">
                                <img src="LOGO_HINT" alt="Logo" style="width: 100px">
                            </td>
                        </tr>
                    </table>
                </div>
            <div style="padding: 40px 40px 30px;margin: 0 40px; font-family: system-ui">
                <div style="font-size: 20px;font-weight: 700;">Verify your email</div>
                <div style="font-weight: 400;font-size: 14px;color: rgba(25, 25, 25, 0.9);line-height: 1.8;margin: 10px 0 0;">
                    This code expires in 10 minutes. Do not share this code
                    with anyone.
                </div>
                <div style="font-size: 24px;font-weight: 700;line-height: 2;letter-spacing: 10px;background: rgba(246, 246, 246, 1);border-radius: 10px;padding: 5px 20px;margin-top: 30px;margin-bottom: 30px;display: inline-block;color:COLOR_HINT">
                    CODE_HINT
                </div>
                <div style="font-size: 12px; font-weight: 400;color: rgba(99, 115, 129, 1);">
                    For your security, please keep this information
                    confidential and <strong>DO NOT SHARE</strong> it with
                    anyone, including <strong>customer service</strong>.
                </div>
            </div>
            <div style="font-size: 12px;font-weight: 400;color: rgba(99, 115, 129, 1);text-align: center;border-top: 1px solid rgba(145, 158, 171, 0.2);padding: 20px 0 30px;">
                If you have any questions, reach out to our support team at
                support@tomo.inc
            </div>
            <div style="font-weight: 400;font-size: 12px;line-height: 17px;color: rgba(137, 137, 171, 1);text-align: center">
                <table style="width: 120px; margin: 0 auto;">
                    <tr>
                        <td style="text-align: center; vertical-align: middle;">
                            <div style="margin-right: 4px;">Powered by</div>
                        </td>
                        <td style="width: 37px">
                            <img src="https://pub.tomo.inc/public/tomo_power.jpeg" alt="Logo" width="37px">
                        </td>
                    </tr>
                </table>
            </div>
            </div>
            </div>
            </body>
            </html>
            """;

    public static final String TRADE_PASSWORD_ERROR_EMAIL_CONTENT = """
            <!DOCTYPE html>
            <html lang="en">
              <head>
                <meta charset="utf-8" />
                <meta name="viewport" content="width=device-width, initial-scale=1" />
                <meta  http-equiv="Content-Type" content="text/html charset=UTF-8" />
              </head>
              <body style="margin:0 auto;padding: 12px 24px;width:360px;overflow:hidden;height:510px;box-sizing:border-box;border:1px solid rgba(252, 244, 204, 1);border-radius:.75rem;text-align:center;color:#fff;background: #121212;">
                <div style="height: 100%;">
                    <div style="margin: 0 16px;padding: 20px 0;border-bottom: 1px solid rgba(226, 227, 240, 0.20);">
                        <img src="{project-logo}" alt="Tomo" style="width: 40px;height: 14px;">
                        <span style="color: #ffffff;font-size: 16px;margin-left: 16px;">{project-name}</span>
                    </div>
                    <div style="padding: 24px 0;">
                        <div style="color: #ffffff;font-size: 18px;font-weight: 600;margin-bottom: 30px;">Security Alert</div>
                        <div style="color: #ffffff;font-size: 13px;margin-bottom: 30px;">The system has detected multiple incorrect pay PIN attempts.</div>
                        <div style="color: #ffffff;font-size: 13px;margin-bottom: 30px;">Please ensure the security of your account settings.</div>
                        <div style="font-size: 10px;color: rgba(255, 255, 255, 0.40);">
                            This request is generated on <span style="font-weight: 700;">{date}</span> from <span style="font-weight: 700;">{user-agent}</span> with the IP address <span style="font-weight: 700;">{ip}</span>
                        </div>
                    </div>
                    <div style="border-top: 1px solid rgba(226, 227, 240, 0.20);padding-top: 12px;">
                        <div style="font-size: 10px;color: rgba(255, 255, 255, 0.40);text-align: left;display: flex;"><span style="margin-right: 5px;">·</span>If this wasn't your doing, please promptly update your account settings and be aware of security risks.</div>
                        <div style="font-size: 10px;color: rgba(255, 255, 255, 0.40);text-align: left;display: flex;word-break: break-all;"><span style="margin-right: 5px;">·</span><div>If you have any questions, please contact <a style="color: #F5E17A;text-decoration: none;" href="https://t.me/tomoinc" target="_blank">customer service</a> for assistance.</div></div>
                    </div>
                    <div style="font-size: 10px;color: rgba(255, 255, 255, 0.40);margin-top: 12px;">
                        powered by
                        <img src="https://static.tomo.inc/public/tomo_connect.png" alt="Tomo Connect" title="Tomo Connect" style="width: 38px;height: 16px;">
                    </div>
                </div>
              </body>
            </html>
            """;
    public static final String TRADE_PASSWORD_FROZEN_EMAIL_CONTENT = """
            <!DOCTYPE html>
            <html lang="en">
              <head>
                <meta charset="utf-8" />
                <meta name="viewport" content="width=device-width, initial-scale=1" />
                <meta  http-equiv="Content-Type" content="text/html charset=UTF-8" />
              </head>
              <body style="margin:0 auto;padding: 12px 24px;width:360px;overflow:hidden;height:510px;box-sizing:border-box;border:1px solid rgba(252, 244, 204, 1);border-radius:.75rem;text-align:center;color:#fff;background: #121212;">
                <div style="height: 100%;">
                    <div style="margin: 0 16px;padding: 20px 0;border-bottom: 1px solid rgba(226, 227, 240, 0.20);">
                        <img src="{project-logo}" alt="Tomo" style="width: 40px;height: 14px;">
                        <span style="color: #ffffff;font-size: 16px;margin-left: 16px;">{project-name}</span>
                    </div>
                    <div style="padding: 24px 0;">
                      <div style="color: #ffffff;font-size: 18px;font-weight: 600;margin-bottom: 30px;">Security Alert</div>
                      <div style="color: #ffffff;font-size: 13px; text-align: center;margin-bottom: 30px;">The system has detected multiple incorrect pay PIN attempts.</div>
                      <div style="color: #ffffff;font-size: 13px; text-align: center;margin-bottom: 30px;">The operation of this wallet will be frozen by tomorrow (UTC+0).</div>
                      <div style="font-size: 10px;color: rgba(255, 255, 255, 0.40);margin-bottom: 30px;">
                            This request is generated on <span style="font-weight: 700;">{date}</span> from <span style="font-weight: 700;">{user-agent}</span> with the IP address <span style="font-weight: 700;">{ip}</span>
                      </div>
                    </div>
                    <div>
                      <div style="border-top: 1px solid rgba(226, 227, 240, 0.20);padding-top: 12px;"></div>
                        <div style="display: flex;font-size: 10px;color: rgba(255, 255, 255, 0.40);text-align: left;"><span style="margin-right: 5px;">·</span>If this wasn't your doing, please promptly update your account settings and be aware of security risks.</div>
                        <div style="display: flex;word-break: break-all;font-size: 10px;color: rgba(255, 255, 255, 0.40);text-align: left;"><span style="margin-right: 5px;">·</span><div>If you have any questions, please contact <a style="color: #F5E17A;text-decoration: none;" href="https://t.me/tomoinc" target="_blank">customer service</a> for assistance.</div></div>
                      </div>
                      <div style="font-size: 10px;color: rgba(255, 255, 255, 0.40);margin-top: 12px;">
                          powered by
                          <img src="https://static.tomo.inc/public/tomo_connect.png" alt="Tomo Connect" title="Tomo Connect" style="width: 38px;height: 16px;">
                      </div>
                    </div>
                </div>
              </body>
            </html>
            """;
    public static final String EXPORT_SEED_FIRST_EMAIL = "Tomo - Confirmation of Seed Phrase Export Request";
    public static final String EXPORT_SEED_SEDOND_EMAIL = "Reminder: Tomo - Seed Phrase Export Available";
    public static final String EXPORT_SEED_FIRST_EMAIL_CONTENT = """
                        <!doctype html>
            <html lang="en">
            
            <head>
                <meta charset="UTF-8" />
                <meta name="viewport" content="width=device-width, initial-scale=1.0" />
                <title>Request to export seed phrase(s)</title>
            </head>
            
            <body style="background: rgba(235, 236, 241, 1);margin: 0;">
                <div>
                    <div
                        style="background: #ffffff;border: 1px solid rgba(226, 227, 240, 1);margin: 10px;border-radius: 2px;overflow: hidden;text-align: left;padding-bottom: 25px;">
                        <div style="padding: 18px;margin: 0 40px;border-bottom: 1px solid rgba(145, 158, 171, 0.2);">
                            <table style="width: 100%">
                                <tr>
                                    <td style="text-align: center; vertical-align: middle;">
                                        <img src="LOGO_HINT" alt="Logo" style="width: 100px">
                                    </td>
                                </tr>
                            </table>
                        </div>
                        <div style="padding: 40px 40px 30px;margin: 0 40px;">
                            <div style="font-size: 20px;font-weight: 700;">
                                Request to export seed phrase(s)
                            </div>
                            <div
                                style="font-weight: 400;font-size: 14px;color: rgba(25, 25, 25, 0.9);line-height: 1.8;margin: 10px 0 0;">
                                Dear User
                            </div>
                            <div
                                style="font-weight: 400;font-size: 14px;color: rgba(25, 25, 25, 0.9);line-height: 1.8;margin: 10px 0 0;">
                                You have requested to export your Tomo wallet seed phrase from Cubist. The seed phrase will become
                                accessible in <strong style="color: COLOR_HINT">48 hours</strong>. Please visit the Tomo App or Tomo
                                Telegram wallet to check the status of
                                your request.
                            </div>
                            <div
                                style="font-weight: 400;font-size: 14px;color: rgba(25, 25, 25, 0.9);line-height: 1.8;margin: 10px 0 0;">
                                If you did not make this request, please cancel it immediately via the Tomo App or Tomo Telegram
                                wallet to ensure the security of your account.
                            </div>
                        </div>
                        <div
                            style="font-size: 12px;font-weight: 400;color: rgba(99, 115, 129, 1);text-align: center;border-top: 1px solid rgba(145, 158, 171, 0.2);padding: 20px 0 30px;">
                            If you have any questions, reach out to our support team at
                            support@tomo.inc
                        </div>
                        <div
                            style="font-weight: 400;font-size: 12px;line-height: 17px;color: rgba(137, 137, 171, 1);text-align: center">
                            <table style="width: 120px; margin: 0 auto;">
                                <tr>
                                    <td style="text-align: center; vertical-align: middle;">
                                        <div style="margin-right: 4px;">Powered by</div>
                                    </td>
                                    <td style="width: 37px">
                                        <img src="https://pub.tomo.inc/public/tomo_power.jpeg" alt="Logo" width="37px">
                                    </td>
                                </tr>
                            </table>
                        </div>
                    </div>
                </div>
            </body>
            
            </html>
            """;
    public static final String EXPORT_SEED_SECOND_EMAIL_CONTENT = """
            <!doctype html>
                   <html lang="en">
            
                   <head>
                       <meta charset="UTF-8" />
                       <meta name="viewport" content="width=device-width, initial-scale=1.0" />
                       <title>Request to export seed phrase(s)</title>
                   </head>
            
                   <body style="background: rgba(235, 236, 241, 1);margin: 0;">
                       <div>
                           <div
                               style="background: #ffffff;border: 1px solid rgba(226, 227, 240, 1);margin: 10px;border-radius: 2px;overflow: hidden;text-align: left;padding-bottom: 25px;">
                               <div style="padding: 18px;margin: 0 40px;border-bottom: 1px solid rgba(145, 158, 171, 0.2);">
                                   <table style="width: 100%">
                                       <tr>
                                           <td style="text-align: center; vertical-align: middle;">
                                               <img src="LOGO_HINT" alt="Logo" style="width: 100px">
                                           </td>
                                       </tr>
                                   </table>
                               </div>
                               <div style="padding: 40px 40px 30px;margin: 0 40px;">
                                   <div style="font-size: 20px;font-weight: 700;">
                                       Seed Phrase Export Available
                                   </div>
                                   <div
                                       style="font-weight: 400;font-size: 14px;color: rgba(25, 25, 25, 0.9);line-height: 1.8;margin: 10px 0 0;">
                                       Dear User
                                   </div>
                                   <div
                                       style="font-weight: 400;font-size: 14px;color: rgba(25, 25, 25, 0.9);line-height: 1.8;margin: 10px 0 0;">
                                       Your requested Tomo wallet seed phrase export is now accessible. Please visit the Tomo App or Tomo
                                       Telegram wallet to check.
                                   </div>
                                   <div
                                       style="font-weight: 400;font-size: 14px;color: rgba(25, 25, 25, 0.9);line-height: 1.8;margin: 10px 0 0;">
                                       <strong>Kindly note:</strong>
                                       <ul>
                                           <li>The export will remain available for <strong style="color: COLOR_HINT">72 hours</strong> only.
                                           </li>
                                           <li>If the time expires, you will need to submit a new export request and wait another
                                               <strong style="color: COLOR_HINT">48 hours</strong>
                                               for processing.
                                           </li>
                                       </ul>
                                   </div>
                                   <div
                                       style="font-weight: 400;font-size: 14px;color: rgba(25, 25, 25, 0.9);line-height: 1.8;margin: 10px 0 0;">
                                       If you did not make this request or need further assistance, please contact our support team
                                   immediately.
                                   </div>
                               </div>
                               <div
                                   style="font-weight: 400;font-size: 12px;line-height: 17px;color: rgba(137, 137, 171, 1);text-align: center">
                                   <table style="width: 120px; margin: 0 auto;">
                                       <tr>
                                           <td style="text-align: center; vertical-align: middle;">
                                               <div style="margin-right: 4px;">Powered by</div>
                                           </td>
                                           <td style="width: 37px">
                                               <img src="https://pub.tomo.inc/public/tomo_power.jpeg" alt="Logo" width="37px">
                                           </td>
                                       </tr>
                                   </table>
                               </div>
                           </div>
                       </div>
                   </body>
            
                   </html>
            """;

    public static final String userS3AssumedRoleCredentialKey = "USER_S3_KEY";

    public static final String HOT_VOTE_DATA_KEY = "HOT_VOTE_DATA_KEY";

    public static final String HOT_PASS_DATA_KEY = "HOT_PASS_DATA_KEY";

    public static final String GEO_KEY = "LOCATION_KEY";
    public static final double MAX_LONGITUDE = 180;
    public static final double MIN_LONGITUDE = -180;

    public static final double MAX_LATITUDE = 85.05112878;
    public static final double MIN_LATITUDE = -85.05112878;

    public static final long JWT_EXPIRATION = 30 * 24 * 60 * 60 * 1000L;

    public static final long JWT_EXPIRATION_2_HOUR = 2 * 60 * 60 * 1000L;

    public static final long JWT_REGENERATION_TIME = 7 * 24 * 60 * 60 * 1000L;

    public static final long TIME_OF_5_MINUTES = 5 * 60L;

    public static final long TIME_OF_1_MINUTES = 60L;

    public static final long TIME_OF_1_DAY = 24 * 60 * TIME_OF_1_MINUTES;

    public static final BigDecimal TOKEN_DECIMALS = BigDecimal.valueOf(10).pow(18);
    public static final BigDecimal USDT_TOKEN_DECIMALS = BigDecimal.valueOf(10).pow(6);

    public static final int COLLECTION_RANDOM_IMAGE_COUNT = 6;

    public static final String COLLECTION_IMAGE_URL_TEMPLATE = "https://pub.tomo.inc/public/passNFT/%d.jpg";
    public static final long USER_RECOMMEND_STORY_CACHE_EXPIRE = 60 * 10;

    public static class Cache {

        public static final String USER = "CACHE_USER";

        public static final String USER_INFO = "CACHE_USER_INFO";

        public static final String HOT_VOTE = "CACHE_HOT_VOTE";
        public static final String PYQ_RESOURCE_PRESIGNED_URL = "PYQ_PRESIGNED_URL_Key:%s";

        public static final String TOP_VOTE = "CACHE_TOP_VOTE";

        public static final String HOT_PASS = "CACHE_HOT_PASS";

        public static final String TOP_PASS = "CACHE_TOP_PASS";

        public static final String TOP_GLOBAL = "CACHE_TOP_GLOBAL";

        public static final String CACHE_TOP_USER_STORY_MAINTAIN = "CACHE_TOP_USER_STORY_MAINTAIN";

        public static final String CACHE_KEY_LOCATION = "CACHE_KEY_LOCATION";

        public static final String ONLINE_USERS = "ONLINE_USERS";

        public static final String UNCLAIMED_VALUE = "UNCLAIMED_VALUE";
        public static final String GLOBAL_BUY = "GLOBAL_BUY";

        public static final String HOLDING_VALUE = "HOLDING_VALUE";

        public static final String POINT = "POINT";

        public static final String STORY_LIKE_COUNT = "CACHE_STORY_LIKE_COUNT";

        public static final String STORY_COMMENT_COUNT = "CACHE_STORY_COMMENT_COUNT";

        public static final String STORY_COMMENT_LIKE_COUNT = "CACHE_STORY_COMMENT_LIKE_COUNT";

        public static final String STORY_MEDIAS = "CACHE_STORY_MEDIAS";

        public static final String USER_PROFIT = "CACHE_USER_PROFIT";

        public static final String RECOMMEND_STORIES = "CACHE_RECOMMEND_STORIES";

        public static final String RECOMMEND_STORIES_ONLY_SPACE_VIDEO = "CACHE_RECOMMEND_STORIES_ONLY_SPACE_VIDEO";

        public static final String NEAR_BY_STORIES = "CACHE_NEAR_BY_STORIES";
        public static final String NEAR_BY_STORIES_ONLY_SPACE_VIDEO = "CACHE_NEAR_BY_STORIES_ONLY_SPACE_VIDEO";

        public static final String USER_RECOMMEND_STORIES = "CACHE_USER_RECOMMEND_STORIES";

        public static final String USER_NEARBY_STORIES = "CACHE_USER_NEARBY_STORIES";

        public static final String USER_VIEWED_STORIES = "CACHE_USER_VIEWED_STORIES";

        public static final String GEO_IP = "GEO_IP";
        public static final String GEO_COORDINATE = "GEO_COORDINATE";

        public static final String USER_HOLDING_TOMOJIS = "CACHE_USER_HOLDING_TOMOJIS";

        public static final String CACHE_BITCOIN_FEE_RATE = "CACHE_BITCOIN_FEE_RATE";

        public static final String LAYER3_BOUGHT_ONE_KEY = "LAYER3_BOUGHT_ONE_KEY";
        public static final String LAYER3_POSTED_STORY = "LAYER3_POSTED_STORY";
        public static final String LAYER3_MORE_KEY_AND_SOCIAL = "LAYER3_MORE_KEY_AND_SOCIAL";
        public static final String PRICE = "PRICE";
        public static final String PRICE_BY_NAME = "PRICE_BY_NAME#10";
        public static final String BRC20_BALANCE = "BRC20_BALANCE";
        public static final String BRC20_TICKER_HISTORY = "BRC20_TICKER_HISTORY";
        public static final String WALLET_NFTS = "WALLET_NFTS";
        public static final String INSCRIPTION_UTXO = "CACHE_INSCRIPTION_UTXO";
        public static final String INSCRIPTIONS = "CACHE_INSCRIPTIONS";
        public static final String INSCRIPTION_INFO = "CACHE_INSCRIPTION_INFO";
        public static final String UTXO = "CACHE_UTXO";
        public static final String TRENDING_TOKEN_NAME_LIST = "CACHE_TRENDING_TOKEN_NAME_LIST_%s";
        public static final String TRENDING_TOKEN_LIST = "CACHE_TRENDING_TOKEN_LIST#30";
        public static final String MOONSHOT_TOKEN_LIST = "CACHE_MOONSHOT_TOKEN_LIST#30";
        public static final String DEFAULT_TOKEN_LIST = "CACHE_DFAULT_TOKEN_LIST#30";
        public static final String SELECTED_TOKEN_LIST = "CACHE_SELECTED_TOKEN_LIST#30";
        public static final String ALL_TOKEN_NAME_LIST_TEMPLATE = "CACHE_ALL_TOKEN_NAME_LIST_%s";
        public static final String BINANCE_ALPHA_LIST = "CACHE_BINANCE_ALPHA_LIST";
        public static final String SWAP_TOKEN_LIST = "CACHE_SWAP_TOKEN_LIST#30";
        public static final String ALL_TOKEN_LIST = "CACHE_ALL_TOKEN_LIST#30";
        public static final String DAPP_LIST = "CACHE_DAPP_LIST#30";
        public static final String DAPP_TYPE_LIST = "CACHE_DAPP_TYPE_LIST#30";
        public static final String TOKEN_TAGS = "CACHE_TOKEN_TAGS#30";
        public static final String TOKEN_LIST_BY_TAG = "CACHE_TOKEN_LIST_BY_TAG#30";
        public static final String TOKEN_OHLCV_BY_DAY = "CACHE_TOKEN_OHLCV_BY_DAY#3600";
        public static final String TOKEN_OHLCV_BY_WEEK = "CACHE_TOKEN_OHLCV_BY_WEEK#3600";
        public static final String TOKEN_OHLCV_BY_MONTH = "CACHE_TOKEN_OHLCV_BY_MONTH#3600";
        public static final String TOKEN_OHLCV_BY_HOUR = "CACHE_TOKEN_OHLCV_BY_HOUR#600";
        public static final String TOKEN_OHLCV_BY_FOUR_HOUR = "CACHE_TOKEN_OHLCV_BY_FOUR_HOUR#600";
        public static final String TOKEN_OHLCV_BY_MINUTE = "CACHE_TOKEN_OHLCV_BY_MINUTE#60";
        public static final String TOKEN_OHLCV_BY_FIVE_MINUTE = "CACHE_TOKEN_OHLCV_BY_FIVE_MINUTE#60";
        public static final String TOKEN_OHLCV_BY_FIFTEEN_MINUTE = "CACHE_TOKEN_OHLCV_BY_FIFTEEN_MINUTE#60";
        public static final String TOKEN_LATEST_TRADES = "CACHE_TOKEN_LATEST_TRADES#3";
        public static final String TOKEN_MARKET_DATA = "CACHE_TOKEN_MARKET_DATA#60";
        public static final String TOKEN_K_LINE = "CACHE_TOKEN_K_LINE#3";
        public static final String GOPLUS_TOKEN_BY_ONE_HOUR = "CACHE_GOPLUS_TOKEN_BY_ONE_HOUR#3600";
        public static final String CUIBST_OIDC_USER_INFO = "CACHE_CUIBST_OIDC_NEW_USER_INFO#15810000";

        public static final String TRADE_PASSWORD_INVALID_TIMES_KEY = "trade:password:invalid:times:user:%s";
        public static final String SOCIAL_TRADE_PASSWORD_INVALID_TIMES_KEY = "social:trade:password:invalid:times:user:%s";

    }

    public static class Lock {
        public static final String SET_V2_ADDRESS = "LOCK_SET_V2_ADDRESS_%s";
    }

    public static class Chain {
        public static final String ETH = "ETH";
        public static final String ARBITRUM = "ARBITRUM";
        public static final String OPTIMISM = "OPTIMISM";
        public static final String BASE = "BASE";
        public static final String BSC = "BSC";
        public static final String BITCOIN = "BITCOIN";
        public static final String SOLANA = "SOLANA";
        public static final String TON = "TON";
        public static final String TRON = "TRON";
        public static final String SUI = "SUI";
    }

    public static final String JWT_KEY_ID = "23312461726";
    public static final String MODERATION_TYPE_PYQ = "pyq";
    public static final String MODERATION_TYPE_STORY = "story";
    public static final String MODERATION_TYPE_GROUP = "group";
    public static final String MODERATION_TYPE_H5_LINK = "h5_link";

    public static final String AMAZON_RES_DOMAIN = "amazonaws.com";

    public static final Set<String> BannedLabelsInModeration = Set.of(
            "Corpses", "Hanging", "Drug Products", "Drug Use", "Pills", "Drug Paraphernalia",
            "Nazi Party", "White Supremacy", "Extremist",
            "Nudity", "Graphic Male Nudity", "Graphic Female Nudity", "Sexual Activity",
            "Illustrated Explicit Nudity", "Adult Toys",
            "Graphic Violence Or Gore", "Physical Violence", "Weapon Violence", "Weapons", "Self Injury");

    // HOLDING_WEIGHT:{wallet_address}:{end_time}
    public static final String USER_HOLDING_WEIGHT_KEY = "HOLDING_WEIGHT:%s:%s";

    public static final String USER_HOLDING_TOTAL_POINT_PAGE = "USER_HOLDING_TOTAL_POINT_PAGE:%s"; // %s as period id
    public static final String USER_HOLDING_TOTAL_POINT_PAGE_POINT = "USER_HOLDING_TOTAL_POINT_PAGE_POINT:%s:%s"; //%s:%s as (period id):page

    public static final String USER_HOLDING_USER_PAGE = "USER_HOLDING_USER_PAGE:%s"; //%s as (period id)

    public static final String PARTNER_LINK_REPLACE_STRING = "{tomoCode}";

    public static final String COULD_REGISTER_OPEN_APP_ID = "1000NPK23xfMZruc9aN";

    public static final String USER_H5_LINK_BASE = "https://l.tomo.inc/";
    public static final String USER_H5_LINK_BASE_DEV = "http://tomo-link.fans.tech/";
    public static final String ETH_PRICE_KEY = "ETH_PRICE_KEY";

    public final static String MOBILE_REGISTER_KEY = "register:verify:mobile:%s";
    public final static String MOBILE_LOGIN_KEY = "login:verify:mobile:%s";
    public final static String MOBILE_RECOVER_KEY = "recover:verify:mobile:%s";

    public final static String MANAGER_EMAIL_LOGIN_KEY = "manager:login:verify:email:%s";

    public final static String VERIFICATION_CODE_EMAIL_TEMPLATE_BACKGROUND_PLACE_HOLDER = "BACKGROUND_PLACE_HOLDER";

    public final static String VERIFICATION_CODE_EMAIL_TEMPLATE_PROJECT_PLACE_HOLDER = "PROJECT_PLACE_HOLDER";

    public final static String VERIFICATION_CODE_EMAIL_TEMPLATE_CODE_PLACE_HOLDER = "CODE_PLACE_HOLDER";

    public final static String VERIFICATION_CODE_EMAIL_TEMPLATE_COLOR_PLACE_HOLDER = "COLOR_PLACE_HOLDER";

    public final static String VERIFICATION_CODE_EMAIL_TEMPLATE_LOGO_PLACE_HOLDER = "LOGO_PLACE_HOLDER";

    public final static String VERIFICATION_CODE_EMAIL_TEMPLATE_ORIGINAL_IP_PLACE_HOLDER = "IP_PLACE_HOLDER";

    public final static String VERIFICATION_CODE_EMAIL_TEMPLATE_TIMESTAMP_PLACE_HOLDER = "TIMESTAMP_PLACE_HOLDER";

    public final static String VERIFICATION_CODE_EMAIL_TEMPLATE_USER_AGENT_PLACE_HOLDER = "AGENT_PLACE_HOLDER";

    public final static String VERIFICATION_CODE_EMAIL_TEMPLATE_CODE_DEFAULT_PROJECT = "tomo";

    public final static String VERIFICATION_CODE_EMAIL_TEMPLATE_CODE_DEFAULT_COLOR = "#F21F7F";

    public final static String VERIFICATION_CODE_EMAIL_TEMPLATE_CODE_DEFAULT_LOGO = "https://dashboard.tomo.inc/_next/image?url=%2Fimages%2Fnew_logo_big.png&w=64&q=75";

    public final static String VERIFICATION_CODE_EMAIL_TEMPLATE_V2 = "<!DOCTYPE html><html lang=\"en\"><head><meta charset=\"UTF-8\"><meta name=\"viewport\" content=\"width=device-width,initial-scale=1\"><meta http-equiv=\"Content-Type\" content=\"text/html charset=UTF-8\"><title>Verification Code</title></head><body><div style=\"margin:0 auto;width:700px;overflow:hidden;height:424px;box-sizing:border-box;padding:50px;border:1px solid #e2e3f0;border-radius:.75rem;text-align:center;color:#000;background:url('https://pub.tomo.inc/emailbg.png') no-repeat 0 0;background-size:cover\"><div style=\"margin:0 auto;width:546px;height:30px;padding:10px 0;border-bottom:1px solid #e2e3f0;text-align:center;vertical-align:top\"><img src=\""
            + VERIFICATION_CODE_EMAIL_TEMPLATE_LOGO_PLACE_HOLDER
            + "\" width=\"30\" height=\"30\" alt=\"logo\"><span style=\"font-size:20px;font-weight:600;vertical-align:super;margin-left:10px\">"
            + VERIFICATION_CODE_EMAIL_TEMPLATE_PROJECT_PLACE_HOLDER +
            "</span></div><div><div style=\"font-size:26px;margin-top:30px;margin-bottom:14px;font-weight:700\">Verify your email address</div><div style=\"font-size:14px;line-height:20px\"><p style=\"margin:0;padding:0\">Please verify your email address using the code below to login.</p><p style=\"margin:0;padding:0\">The verification code will expire in 5 minutes</p></div><div style=\"width:352px;height:78px;margin:20px auto;border:1px solid #e2e3f0;border-radius:4px\"><div style=\"line-height:78px;font-weight:700;font-size:32px;letter-spacing:10px;color:"
            + VERIFICATION_CODE_EMAIL_TEMPLATE_COLOR_PLACE_HOLDER
            + "\">"
            + VERIFICATION_CODE_EMAIL_TEMPLATE_CODE_PLACE_HOLDER
            + "</div></div></div><div style=\"text-align:center;font-size:10px;color:rgba(18,18,18,.25)\">This request is generated on<span style=\"font-weight:700\">"
            + VERIFICATION_CODE_EMAIL_TEMPLATE_TIMESTAMP_PLACE_HOLDER
            + "</span>from<span style=\"font-weight:700\">"
            + VERIFICATION_CODE_EMAIL_TEMPLATE_USER_AGENT_PLACE_HOLDER
            + "</span>with the IP address<span style=\"font-weight:700\">"
            + VERIFICATION_CODE_EMAIL_TEMPLATE_ORIGINAL_IP_PLACE_HOLDER
            + ".</span>If this is not done by you</div></div></body></html>";

    public final static String INVITE_URL = "https://dashboard.tomo.inc/";
    public final static String DEV_INVITE_URL = "https://dashboard-dev.tomo.inc/";

    public final static int WRONG_TIMES = 10;
}