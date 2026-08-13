.class final LS/X0$a$a$a;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LS/X0$a$a;->a(LK0/w;)V
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

    iput-object p1, p0, LS/X0$a$a$a;->D:LS/U0;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, LS/X0$a$a$a;->D:LS/U0;

    invoke-interface {v0}, LS/U0;->dismiss()V

    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    return-object v0
.end method

.method public bridge synthetic b()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LS/X0$a$a$a;->a()Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method
