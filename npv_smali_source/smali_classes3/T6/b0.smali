.class public final synthetic LT6/b0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lx7/a;


# instance fields
.field public final synthetic C:LT6/g0;


# direct methods
.method public synthetic constructor <init>(LT6/g0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LT6/b0;->C:LT6/g0;

    return-void
.end method


# virtual methods
.method public final b()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, LT6/b0;->C:LT6/g0;

    invoke-static {v0}, LT6/g0;->a(LT6/g0;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
