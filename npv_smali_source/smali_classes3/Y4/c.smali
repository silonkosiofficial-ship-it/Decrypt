.class public final LY4/c;
.super LV4/d;
.source "SourceFile"


# instance fields
.field private final a:Ljava/lang/String;

.field private final b:LQ4/m;


# direct methods
.method private constructor <init>(Ljava/lang/String;LQ4/m;)V
    .locals 0

    invoke-direct {p0}, LV4/d;-><init>()V

    invoke-static {p1}, LQ3/p;->f(Ljava/lang/String;)Ljava/lang/String;

    iput-object p1, p0, LY4/c;->a:Ljava/lang/String;

    iput-object p2, p0, LY4/c;->b:LQ4/m;

    return-void
.end method

.method public static a(LV4/c;)LY4/c;
    .locals 2

    invoke-static {p0}, LQ3/p;->l(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v0, LY4/c;

    invoke-virtual {p0}, LV4/c;->b()Ljava/lang/String;

    move-result-object p0

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, LY4/c;-><init>(Ljava/lang/String;LQ4/m;)V

    return-object v0
.end method
