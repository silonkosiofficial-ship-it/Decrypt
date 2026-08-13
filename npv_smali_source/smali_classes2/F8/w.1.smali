.class public abstract LF8/w;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:LF8/p0;

.field private final b:Ljava/util/Set;

.field private final c:LF8/M;


# direct methods
.method public constructor <init>(LF8/p0;Ljava/util/Set;LF8/M;)V
    .locals 1

    const-string v0, "howThisTypeIsUsed"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LF8/w;->a:LF8/p0;

    iput-object p2, p0, LF8/w;->b:Ljava/util/Set;

    iput-object p3, p0, LF8/w;->c:LF8/M;

    return-void
.end method


# virtual methods
.method public abstract a()LF8/M;
.end method

.method public abstract b()LF8/p0;
.end method

.method public abstract c()Ljava/util/Set;
.end method

.method public abstract d(LO7/f0;)LF8/w;
.end method

.method public abstract hashCode()I
.end method
