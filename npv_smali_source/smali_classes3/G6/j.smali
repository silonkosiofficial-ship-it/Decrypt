.class public final synthetic LG6/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lx7/a;


# instance fields
.field public final synthetic C:LU6/b;


# direct methods
.method public synthetic constructor <init>(LU6/b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LG6/j;->C:LU6/b;

    return-void
.end method


# virtual methods
.method public final b()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, LG6/j;->C:LU6/b;

    invoke-static {v0}, LG6/l;->c(LU6/b;)Lio/ktor/utils/io/d;

    move-result-object v0

    return-object v0
.end method
