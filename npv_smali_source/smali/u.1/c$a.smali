.class final Lu/c$a;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lu/c;->e(Ljava/lang/Object;Lu/x0;Lu/j;Ljava/lang/Object;Ljava/lang/String;Lx7/l;LV/n;II)LV/G1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:LY8/j;

.field final synthetic E:Ljava/lang/Object;


# direct methods
.method constructor <init>(LY8/j;Ljava/lang/Object;)V
    .locals 0

    iput-object p1, p0, Lu/c$a;->D:LY8/j;

    iput-object p2, p0, Lu/c$a;->E:Ljava/lang/Object;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 2

    iget-object v0, p0, Lu/c$a;->D:LY8/j;

    iget-object v1, p0, Lu/c$a;->E:Ljava/lang/Object;

    invoke-interface {v0, v1}, LY8/C;->j(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public bridge synthetic b()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lu/c$a;->a()V

    sget-object v0, Li7/M;->a:Li7/M;

    return-object v0
.end method
