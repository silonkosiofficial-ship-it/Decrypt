.class final LS/u;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Lo0/Q1;

.field private final b:Lo0/T1;

.field private final c:Lo0/Q1;


# direct methods
.method public constructor <init>(Lo0/Q1;Lo0/T1;Lo0/Q1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LS/u;->a:Lo0/Q1;

    iput-object p2, p0, LS/u;->b:Lo0/T1;

    iput-object p3, p0, LS/u;->c:Lo0/Q1;

    return-void
.end method

.method public synthetic constructor <init>(Lo0/Q1;Lo0/T1;Lo0/Q1;ILy7/k;)V
    .locals 0

    .prologue
    and-int/lit8 p5, p4, 0x1

    if-eqz p5, :cond_0

    invoke-static {}, Lo0/Y;->a()Lo0/Q1;

    move-result-object p1

    :cond_0
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_1

    invoke-static {}, Lo0/X;->a()Lo0/T1;

    move-result-object p2

    :cond_1
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_2

    invoke-static {}, Lo0/Y;->a()Lo0/Q1;

    move-result-object p3

    :cond_2
    invoke-direct {p0, p1, p2, p3}, LS/u;-><init>(Lo0/Q1;Lo0/T1;Lo0/Q1;)V

    return-void
.end method


# virtual methods
.method public final a()Lo0/Q1;
    .locals 1

    iget-object v0, p0, LS/u;->a:Lo0/Q1;

    return-object v0
.end method

.method public final b()Lo0/T1;
    .locals 1

    iget-object v0, p0, LS/u;->b:Lo0/T1;

    return-object v0
.end method

.method public final c()Lo0/Q1;
    .locals 1

    iget-object v0, p0, LS/u;->c:Lo0/Q1;

    return-object v0
.end method
