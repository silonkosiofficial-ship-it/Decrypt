.class final LF0/c$b;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LF0/c;->Z1()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:LF0/c;


# direct methods
.method constructor <init>(LF0/c;)V
    .locals 0

    iput-object p1, p0, LF0/c$b;->D:LF0/c;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 2

    iget-object v0, p0, LF0/c$b;->D:LF0/c;

    invoke-virtual {v0}, LF0/c;->T1()Landroidx/compose/ui/d$b;

    move-result-object v0

    const-string v1, "null cannot be cast to non-null type androidx.compose.ui.modifier.ModifierLocalConsumer"

    invoke-static {v0, v1}, Ly7/t;->d(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, LE0/d;

    iget-object v1, p0, LF0/c$b;->D:LF0/c;

    invoke-interface {v0, v1}, LE0/d;->h(LE0/l;)V

    return-void
.end method

.method public bridge synthetic b()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LF0/c$b;->a()V

    sget-object v0, Li7/M;->a:Li7/M;

    return-object v0
.end method
