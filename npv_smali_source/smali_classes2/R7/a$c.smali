.class LR7/a$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lx7/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LR7/a;-><init>(LE8/n;Ln8/f;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic C:LR7/a;


# direct methods
.method constructor <init>(LR7/a;)V
    .locals 0

    iput-object p1, p0, LR7/a$c;->C:LR7/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()LO7/X;
    .locals 2

    new-instance v0, LR7/q;

    iget-object v1, p0, LR7/a$c;->C:LR7/a;

    invoke-direct {v0, v1}, LR7/q;-><init>(LO7/e;)V

    return-object v0
.end method

.method public bridge synthetic b()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LR7/a$c;->a()LO7/X;

    move-result-object v0

    return-object v0
.end method
