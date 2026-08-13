.class public final Li9/j$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Li9/j;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ly7/k;)V
    .locals 0

    invoke-direct {p0}, Li9/j$a;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lx7/l;)Li9/n;
    .locals 2

    const-string v0, "block"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Li9/l$a;

    new-instance v1, Lk9/d;

    invoke-direct {v1}, Lk9/d;-><init>()V

    invoke-direct {v0, v1}, Li9/l$a;-><init>(Lk9/d;)V

    invoke-interface {p1, v0}, Lx7/l;->l(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance p1, Li9/l;

    invoke-virtual {v0}, Li9/l$a;->B()Lk9/f;

    move-result-object v0

    invoke-direct {p1, v0}, Li9/l;-><init>(Lk9/f;)V

    return-object p1
.end method
