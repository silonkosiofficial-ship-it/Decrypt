.class final Lu/y0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lu/x0;


# instance fields
.field private final a:Lx7/l;

.field private final b:Lx7/l;


# direct methods
.method public constructor <init>(Lx7/l;Lx7/l;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lu/y0;->a:Lx7/l;

    iput-object p2, p0, Lu/y0;->b:Lx7/l;

    return-void
.end method


# virtual methods
.method public a()Lx7/l;
    .locals 1

    iget-object v0, p0, Lu/y0;->a:Lx7/l;

    return-object v0
.end method

.method public b()Lx7/l;
    .locals 1

    iget-object v0, p0, Lu/y0;->b:Lx7/l;

    return-object v0
.end method
