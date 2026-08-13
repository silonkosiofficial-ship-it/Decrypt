.class public final synthetic LG6/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lx7/a;


# instance fields
.field public final synthetic C:Lm7/i;

.field public final synthetic D:LU6/b;


# direct methods
.method public synthetic constructor <init>(Lm7/i;LU6/b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LG6/k;->C:Lm7/i;

    iput-object p2, p0, LG6/k;->D:LU6/b;

    return-void
.end method


# virtual methods
.method public final b()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, LG6/k;->C:Lm7/i;

    iget-object v1, p0, LG6/k;->D:LU6/b;

    invoke-static {v0, v1}, LG6/l;->a(Lm7/i;LU6/b;)Lio/ktor/utils/io/d;

    move-result-object v0

    return-object v0
.end method
