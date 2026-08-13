.class public final LU2/a;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Ljava/lang/String;

.field public final c:I

.field public final d:Z

.field public final e:Z

.field public final f:Z

.field public final g:Z

.field public final h:Z

.field public final i:Z


# direct methods
.method private constructor <init>(Ljava/lang/String;Ljava/lang/String;I)V
    .locals 1

    .prologue
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LU2/a;->a:Ljava/lang/String;

    iput-object p2, p0, LU2/a;->b:Ljava/lang/String;

    iput p3, p0, LU2/a;->c:I

    and-int/lit8 p1, p3, 0x1

    const/4 p2, 0x0

    const/4 v0, 0x1

    if-eqz p1, :cond_0

    move p1, v0

    goto :goto_0

    :cond_0
    move p1, p2

    :goto_0
    iput-boolean p1, p0, LU2/a;->e:Z

    and-int/lit8 p1, p3, 0x2

    if-eqz p1, :cond_1

    move p1, v0

    goto :goto_1

    :cond_1
    move p1, p2

    :goto_1
    iput-boolean p1, p0, LU2/a;->g:Z

    and-int/lit8 p1, p3, 0x4

    if-eqz p1, :cond_2

    move p1, v0

    goto :goto_2

    :cond_2
    move p1, p2

    :goto_2
    iput-boolean p1, p0, LU2/a;->h:Z

    and-int/lit8 p1, p3, 0x8

    if-eqz p1, :cond_3

    move p1, v0

    goto :goto_3

    :cond_3
    move p1, p2

    :goto_3
    iput-boolean p1, p0, LU2/a;->i:Z

    and-int/lit8 p1, p3, 0x10

    if-eqz p1, :cond_4

    move p1, v0

    goto :goto_4

    :cond_4
    move p1, p2

    :goto_4
    iput-boolean p1, p0, LU2/a;->f:Z

    and-int/lit8 p1, p3, 0x20

    if-eqz p1, :cond_5

    move p2, v0

    :cond_5
    iput-boolean p2, p0, LU2/a;->d:Z

    return-void
.end method

.method public static a()LU2/a;
    .locals 4

    new-instance v0, LU2/a;

    const-string v1, "RTC_STATUS_EMPTY_ANDROID_ID"

    const/4 v2, 0x0

    const-string v3, "RTC_STATUS_EMPTY_SESSION_ID"

    invoke-direct {v0, v3, v1, v2}, LU2/a;-><init>(Ljava/lang/String;Ljava/lang/String;I)V

    return-object v0
.end method
