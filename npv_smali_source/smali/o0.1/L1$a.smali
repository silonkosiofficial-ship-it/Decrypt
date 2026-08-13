.class public final Lo0/L1$a;
.super Lo0/L1;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo0/L1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field private final a:Lo0/Q1;


# direct methods
.method public constructor <init>(Lo0/Q1;)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lo0/L1;-><init>(Ly7/k;)V

    iput-object p1, p0, Lo0/L1$a;->a:Lo0/Q1;

    return-void
.end method


# virtual methods
.method public a()Ln0/i;
    .locals 1

    iget-object v0, p0, Lo0/L1$a;->a:Lo0/Q1;

    invoke-interface {v0}, Lo0/Q1;->getBounds()Ln0/i;

    move-result-object v0

    return-object v0
.end method

.method public final b()Lo0/Q1;
    .locals 1

    iget-object v0, p0, Lo0/L1$a;->a:Lo0/Q1;

    return-object v0
.end method
