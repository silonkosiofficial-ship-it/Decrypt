.class public final LR0/r;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:LR0/r;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LR0/r;

    invoke-direct {v0}, LR0/r;-><init>()V

    sput-object v0, LR0/r;->a:LR0/r;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Landroid/content/Context;)I
    .locals 2

    .prologue
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1f

    if-lt v0, v1, :cond_0

    sget-object v0, LR0/s;->a:LR0/s;

    invoke-virtual {v0, p1}, LR0/s;->a(Landroid/content/Context;)I

    move-result p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method
