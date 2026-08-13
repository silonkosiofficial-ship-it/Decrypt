.class public Lha/m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lia/b;


# instance fields
.field private final a:Lha/l;

.field private final b:Lfa/b;

.field private final c:Lia/a;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lha/l;

    invoke-direct {v0}, Lha/l;-><init>()V

    iput-object v0, p0, Lha/m;->a:Lha/l;

    new-instance v0, Lha/c;

    invoke-direct {v0}, Lha/c;-><init>()V

    iput-object v0, p0, Lha/m;->b:Lfa/b;

    new-instance v0, Lha/b;

    invoke-direct {v0}, Lha/b;-><init>()V

    iput-object v0, p0, Lha/m;->c:Lia/a;

    return-void
.end method


# virtual methods
.method public a()V
    .locals 0

    return-void
.end method

.method public b()Lfa/a;
    .locals 1

    iget-object v0, p0, Lha/m;->a:Lha/l;

    return-object v0
.end method

.method public c()Ljava/lang/String;
    .locals 1

    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw v0
.end method

.method public d()Lha/l;
    .locals 1

    iget-object v0, p0, Lha/m;->a:Lha/l;

    return-object v0
.end method
