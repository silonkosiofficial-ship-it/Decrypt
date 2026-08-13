.class public final Ls3/v;
.super Ls3/D;
.source "SourceFile"


# instance fields
.field private final C:Ls3/a;


# direct methods
.method public constructor <init>(Ls3/a;)V
    .locals 0

    invoke-direct {p0}, Ls3/D;-><init>()V

    iput-object p1, p0, Ls3/v;->C:Ls3/a;

    return-void
.end method


# virtual methods
.method public final b()V
    .locals 1

    iget-object v0, p0, Ls3/v;->C:Ls3/a;

    invoke-interface {v0}, Ls3/a;->e0()V

    return-void
.end method
