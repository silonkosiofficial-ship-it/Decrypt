.class public final LX9/a0$a;
.super LX9/a0;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LX9/a0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, LX9/a0;-><init>()V

    return-void
.end method


# virtual methods
.method public d(J)LX9/a0;
    .locals 0

    return-object p0
.end method

.method public f()V
    .locals 0

    return-void
.end method

.method public g(JLjava/util/concurrent/TimeUnit;)LX9/a0;
    .locals 0

    const-string p1, "unit"

    invoke-static {p3, p1}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method
