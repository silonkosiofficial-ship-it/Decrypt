.class final Lo0/w0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lo0/w0;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lo0/w0;

    invoke-direct {v0}, Lo0/w0;-><init>()V

    sput-object v0, Lo0/w0;->a:Lo0/w0;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Landroid/graphics/Canvas;Z)V
    .locals 0

    .prologue
    if-eqz p2, :cond_0

    invoke-static {p1}, Lo0/u0;->a(Landroid/graphics/Canvas;)V

    goto :goto_0

    :cond_0
    invoke-static {p1}, Lo0/v0;->a(Landroid/graphics/Canvas;)V

    :goto_0
    return-void
.end method
