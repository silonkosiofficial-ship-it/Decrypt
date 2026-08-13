.class public final LO7/S;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:LO7/i;

.field private final b:Ljava/util/List;

.field private final c:LO7/S;


# direct methods
.method public constructor <init>(LO7/i;Ljava/util/List;LO7/S;)V
    .locals 1

    const-string v0, "classifierDescriptor"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "arguments"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LO7/S;->a:LO7/i;

    iput-object p2, p0, LO7/S;->b:Ljava/util/List;

    iput-object p3, p0, LO7/S;->c:LO7/S;

    return-void
.end method


# virtual methods
.method public final a()Ljava/util/List;
    .locals 1

    iget-object v0, p0, LO7/S;->b:Ljava/util/List;

    return-object v0
.end method

.method public final b()LO7/i;
    .locals 1

    iget-object v0, p0, LO7/S;->a:LO7/i;

    return-object v0
.end method

.method public final c()LO7/S;
    .locals 1

    iget-object v0, p0, LO7/S;->c:LO7/S;

    return-object v0
.end method
