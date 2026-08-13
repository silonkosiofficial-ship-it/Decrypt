.class public final Landroidx/room/d$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LZ8/f;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/room/d;->h([Ljava/lang/String;)LZ8/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic C:LZ8/f;

.field final synthetic D:[Ljava/lang/String;


# direct methods
.method public constructor <init>(LZ8/f;[Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Landroidx/room/d$a;->C:LZ8/f;

    iput-object p2, p0, Landroidx/room/d$a;->D:[Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public b(LZ8/g;Lm7/e;)Ljava/lang/Object;
    .locals 3

    .prologue
    iget-object v0, p0, Landroidx/room/d$a;->C:LZ8/f;

    new-instance v1, Landroidx/room/d$a$a;

    iget-object v2, p0, Landroidx/room/d$a;->D:[Ljava/lang/String;

    invoke-direct {v1, p1, v2}, Landroidx/room/d$a$a;-><init>(LZ8/g;[Ljava/lang/String;)V

    invoke-interface {v0, v1, p2}, LZ8/f;->b(LZ8/g;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object p2

    if-ne p1, p2, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method
