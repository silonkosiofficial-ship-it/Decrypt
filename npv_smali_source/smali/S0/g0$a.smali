.class public final LS0/g0$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LS0/g0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# static fields
.field static final synthetic a:LS0/g0$a;

.field private static final b:LS0/g0;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LS0/g0$a;

    invoke-direct {v0}, LS0/g0$a;-><init>()V

    sput-object v0, LS0/g0$a;->a:LS0/g0$a;

    new-instance v0, LS0/f0;

    invoke-direct {v0}, LS0/f0;-><init>()V

    sput-object v0, LS0/g0$a;->b:LS0/g0;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(LM0/d;)LS0/e0;
    .locals 0

    invoke-static {p0}, LS0/g0$a;->b(LM0/d;)LS0/e0;

    move-result-object p0

    return-object p0
.end method

.method private static final b(LM0/d;)LS0/e0;
    .locals 2

    new-instance v0, LS0/e0;

    sget-object v1, LS0/L;->a:LS0/L$a;

    invoke-virtual {v1}, LS0/L$a;->a()LS0/L;

    move-result-object v1

    invoke-direct {v0, p0, v1}, LS0/e0;-><init>(LM0/d;LS0/L;)V

    return-object v0
.end method


# virtual methods
.method public final c()LS0/g0;
    .locals 1

    sget-object v0, LS0/g0$a;->b:LS0/g0;

    return-object v0
.end method
