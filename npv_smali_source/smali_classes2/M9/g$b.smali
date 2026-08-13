.class public final LM9/g$b;
.super LL9/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LM9/g;-><init>(LL9/e;IJLjava/util/concurrent/TimeUnit;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic e:LM9/g;


# direct methods
.method constructor <init>(LM9/g;Ljava/lang/String;)V
    .locals 2

    iput-object p1, p0, LM9/g$b;->e:LM9/g;

    const/4 p1, 0x2

    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-direct {p0, p2, v1, p1, v0}, LL9/a;-><init>(Ljava/lang/String;ZILy7/k;)V

    return-void
.end method


# virtual methods
.method public f()J
    .locals 3

    iget-object v0, p0, LM9/g$b;->e:LM9/g;

    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, LM9/g;->b(J)J

    move-result-wide v0

    return-wide v0
.end method
