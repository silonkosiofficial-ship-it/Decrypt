.class public final Lo0/r0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Lo0/G;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lo0/G;

    invoke-direct {v0}, Lo0/G;-><init>()V

    iput-object v0, p0, Lo0/r0;->a:Lo0/G;

    return-void
.end method


# virtual methods
.method public final a()Lo0/G;
    .locals 1

    iget-object v0, p0, Lo0/r0;->a:Lo0/G;

    return-object v0
.end method
