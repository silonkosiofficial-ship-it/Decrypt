.class final LD0/Q;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LD0/k0;


# static fields
.field public static final a:LD0/Q;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LD0/Q;

    invoke-direct {v0}, LD0/Q;-><init>()V

    sput-object v0, LD0/Q;->a:LD0/Q;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public b(LD0/k0$a;)V
    .locals 0

    invoke-virtual {p1}, LD0/k0$a;->clear()V

    return-void
.end method
