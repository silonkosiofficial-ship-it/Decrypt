.class final LS/X0$a$b$a;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LS/X0$a$b;->a()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:LS/U0;


# direct methods
.method constructor <init>(LS/U0;)V
    .locals 0

    iput-object p1, p0, LS/X0$a$b$a;->D:LS/U0;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LS/d0;)Ljava/lang/Boolean;
    .locals 1

    invoke-virtual {p1}, LS/d0;->c()Ljava/lang/Object;

    move-result-object p1

    iget-object v0, p0, LS/X0$a$b$a;->D:LS/U0;

    invoke-static {p1, v0}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LS/d0;

    invoke-virtual {p0, p1}, LS/X0$a$b$a;->a(LS/d0;)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method
