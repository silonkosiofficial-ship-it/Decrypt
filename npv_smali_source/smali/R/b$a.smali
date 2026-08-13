.class final LR/b$a;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LR/b;->Y1(Lz/n$b;JF)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:LR/b;


# direct methods
.method constructor <init>(LR/b;)V
    .locals 0

    iput-object p1, p0, LR/b$a;->D:LR/b;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 1

    iget-object v0, p0, LR/b$a;->D:LR/b;

    invoke-static {v0}, LF0/t;->a(LF0/s;)V

    return-void
.end method

.method public bridge synthetic b()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LR/b$a;->a()V

    sget-object v0, Li7/M;->a:Li7/M;

    return-object v0
.end method
