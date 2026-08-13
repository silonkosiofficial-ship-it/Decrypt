.class public Lha/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lfa/b;


# instance fields
.field private final a:Ljava/util/concurrent/ConcurrentMap;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lj$/util/concurrent/ConcurrentHashMap;

    invoke-direct {v0}, Lj$/util/concurrent/ConcurrentHashMap;-><init>()V

    iput-object v0, p0, Lha/c;->a:Ljava/util/concurrent/ConcurrentMap;

    return-void
.end method
