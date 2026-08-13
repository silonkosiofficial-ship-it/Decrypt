.class public final LN7/f$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LN7/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field private final a:LO7/G;

.field private final b:Z


# direct methods
.method public constructor <init>(LO7/G;Z)V
    .locals 1

    const-string v0, "ownerModuleDescriptor"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LN7/f$b;->a:LO7/G;

    iput-boolean p2, p0, LN7/f$b;->b:Z

    return-void
.end method


# virtual methods
.method public final a()LO7/G;
    .locals 1

    iget-object v0, p0, LN7/f$b;->a:LO7/G;

    return-object v0
.end method

.method public final b()Z
    .locals 1

    iget-boolean v0, p0, LN7/f$b;->b:Z

    return v0
.end method
