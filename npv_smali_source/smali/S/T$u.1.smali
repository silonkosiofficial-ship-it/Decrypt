.class final LS/T$u;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LS/T;->h(Landroidx/compose/ui/d;ILx7/l;LV/n;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:Lx7/l;


# direct methods
.method constructor <init>(Lx7/l;)V
    .locals 0

    iput-object p1, p0, LS/T$u;->D:Lx7/l;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 2

    iget-object v0, p0, LS/T$u;->D:Lx7/l;

    sget-object v1, LS/Y;->b:LS/Y$a;

    invoke-virtual {v1}, LS/Y$a;->a()I

    move-result v1

    invoke-static {v1}, LS/Y;->c(I)LS/Y;

    move-result-object v1

    invoke-interface {v0, v1}, Lx7/l;->l(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public bridge synthetic b()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LS/T$u;->a()V

    sget-object v0, Li7/M;->a:Li7/M;

    return-object v0
.end method
