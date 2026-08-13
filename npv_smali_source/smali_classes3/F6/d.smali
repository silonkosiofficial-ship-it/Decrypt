.class public final synthetic LF6/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lx7/a;


# instance fields
.field public final synthetic C:LF6/f;


# direct methods
.method public synthetic constructor <init>(LF6/f;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LF6/d;->C:LF6/f;

    return-void
.end method


# virtual methods
.method public final b()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, LF6/d;->C:LF6/f;

    invoke-static {v0}, LF6/f;->a(LF6/f;)LW8/J;

    move-result-object v0

    return-object v0
.end method
