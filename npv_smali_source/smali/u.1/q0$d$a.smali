.class final Lu/q0$d$a;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lu/q0$d;->a(J)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:Lu/l;


# direct methods
.method constructor <init>(Lu/l;)V
    .locals 0

    iput-object p1, p0, Lu/q0$d$a;->D:Lu/l;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 2

    iget-object v0, p0, Lu/q0$d$a;->D:Lu/l;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lu/l;->u(Z)V

    return-void
.end method

.method public bridge synthetic b()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lu/q0$d$a;->a()V

    sget-object v0, Li7/M;->a:Li7/M;

    return-object v0
.end method
