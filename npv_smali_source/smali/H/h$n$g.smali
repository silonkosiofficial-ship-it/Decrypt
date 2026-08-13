.class final LH/h$n$g;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LH/h$n;->a(LK0/w;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:LH/w;

.field final synthetic E:Landroidx/compose/ui/focus/n;

.field final synthetic F:Z


# direct methods
.method constructor <init>(LH/w;Landroidx/compose/ui/focus/n;Z)V
    .locals 0

    iput-object p1, p0, LH/h$n$g;->D:LH/w;

    iput-object p2, p0, LH/h$n$g;->E:Landroidx/compose/ui/focus/n;

    iput-boolean p3, p0, LH/h$n$g;->F:Z

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/Boolean;
    .locals 3

    iget-object v0, p0, LH/h$n$g;->D:LH/w;

    iget-object v1, p0, LH/h$n$g;->E:Landroidx/compose/ui/focus/n;

    iget-boolean v2, p0, LH/h$n$g;->F:Z

    xor-int/lit8 v2, v2, 0x1

    invoke-static {v0, v1, v2}, LH/h;->l(LH/w;Landroidx/compose/ui/focus/n;Z)V

    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    return-object v0
.end method

.method public bridge synthetic b()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LH/h$n$g;->a()Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method
