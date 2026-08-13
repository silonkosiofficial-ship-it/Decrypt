.class public abstract LV4/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La5/a;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static b()LV4/e;
    .locals 1

    invoke-static {}, LQ4/f;->l()LQ4/f;

    move-result-object v0

    invoke-static {v0}, LV4/e;->c(LQ4/f;)LV4/e;

    move-result-object v0

    return-object v0
.end method

.method public static c(LQ4/f;)LV4/e;
    .locals 1

    const-class v0, LV4/e;

    invoke-virtual {p0, v0}, LQ4/f;->j(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, LV4/e;

    return-object p0
.end method


# virtual methods
.method public abstract a(Z)Ll4/l;
.end method

.method public abstract d(LV4/b;)V
.end method
