.class public final synthetic Lf4/a1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LL4/c$b;


# instance fields
.field public final synthetic a:Lf4/c1;


# direct methods
.method public synthetic constructor <init>(Lf4/c1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lf4/a1;->a:Lf4/c1;

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 2

    iget-object v0, p0, Lf4/a1;->a:Lf4/c1;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lf4/c1;->f(Z)V

    return-void
.end method
