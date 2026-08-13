.class public Ll4/b;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Ll4/v;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ll4/v;

    invoke-direct {v0}, Ll4/v;-><init>()V

    iput-object v0, p0, Ll4/b;->a:Ll4/v;

    return-void
.end method


# virtual methods
.method public a()V
    .locals 1

    iget-object v0, p0, Ll4/b;->a:Ll4/v;

    invoke-virtual {v0}, Ll4/v;->b()V

    return-void
.end method

.method public b()Ll4/a;
    .locals 1

    iget-object v0, p0, Ll4/b;->a:Ll4/v;

    return-object v0
.end method
