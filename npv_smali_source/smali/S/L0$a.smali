.class final LS/L0$a;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LS/L0;->a(Landroidx/compose/ui/d;Lx7/p;Lx7/p;Lx7/p;Lx7/p;IJJLA/S;Lx7/q;LV/n;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:LT/v;

.field final synthetic E:LA/S;


# direct methods
.method constructor <init>(LT/v;LA/S;)V
    .locals 0

    iput-object p1, p0, LS/L0$a;->D:LT/v;

    iput-object p2, p0, LS/L0$a;->E:LA/S;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LA/S;)V
    .locals 2

    iget-object v0, p0, LS/L0$a;->D:LT/v;

    iget-object v1, p0, LS/L0$a;->E:LA/S;

    invoke-static {v1, p1}, LA/U;->c(LA/S;LA/S;)LA/S;

    move-result-object p1

    invoke-virtual {v0, p1}, LT/v;->f(LA/S;)V

    return-void
.end method

.method public bridge synthetic l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LA/S;

    invoke-virtual {p0, p1}, LS/L0$a;->a(LA/S;)V

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method
