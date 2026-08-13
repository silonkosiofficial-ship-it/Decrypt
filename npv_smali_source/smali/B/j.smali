.class public final LB/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LD/o$a;


# instance fields
.field private final a:Lx7/l;

.field private final b:Lx7/l;

.field private final c:Lx7/r;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lx7/l;Lx7/l;Lx7/r;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LB/j;->a:Lx7/l;

    iput-object p2, p0, LB/j;->b:Lx7/l;

    iput-object p3, p0, LB/j;->c:Lx7/r;

    return-void
.end method


# virtual methods
.method public final a()Lx7/r;
    .locals 1

    iget-object v0, p0, LB/j;->c:Lx7/r;

    return-object v0
.end method

.method public getKey()Lx7/l;
    .locals 1

    iget-object v0, p0, LB/j;->a:Lx7/l;

    return-object v0
.end method

.method public getType()Lx7/l;
    .locals 1

    iget-object v0, p0, LB/j;->b:Lx7/l;

    return-object v0
.end method
