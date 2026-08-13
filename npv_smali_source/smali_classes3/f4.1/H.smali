.class public final synthetic Lf4/H;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LL4/f$a;


# direct methods
.method public synthetic constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final b(LL4/e;)V
    .locals 1

    invoke-virtual {p1}, LL4/e;->a()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    const-string v0, "Failed to load and cache a form, error="

    invoke-virtual {v0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    const-string v0, "UserMessagingPlatform"

    nop

    return-void
.end method
