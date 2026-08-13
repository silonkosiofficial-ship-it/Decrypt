.class final Landroidx/lifecycle/M$a;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/lifecycle/M;-><init>(Lx2/d;Landroidx/lifecycle/Y;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:Landroidx/lifecycle/Y;


# direct methods
.method constructor <init>(Landroidx/lifecycle/Y;)V
    .locals 0

    iput-object p1, p0, Landroidx/lifecycle/M$a;->D:Landroidx/lifecycle/Y;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()Landroidx/lifecycle/N;
    .locals 1

    iget-object v0, p0, Landroidx/lifecycle/M$a;->D:Landroidx/lifecycle/Y;

    invoke-static {v0}, Landroidx/lifecycle/L;->e(Landroidx/lifecycle/Y;)Landroidx/lifecycle/N;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic b()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Landroidx/lifecycle/M$a;->a()Landroidx/lifecycle/N;

    move-result-object v0

    return-object v0
.end method
