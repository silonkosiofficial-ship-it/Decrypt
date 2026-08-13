.class public final Lg8/o$d;
.super Lg8/o;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lg8/o;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "d"
.end annotation


# instance fields
.field private final j:Lw8/e;


# direct methods
.method public constructor <init>(Lw8/e;)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lg8/o;-><init>(Ly7/k;)V

    iput-object p1, p0, Lg8/o$d;->j:Lw8/e;

    return-void
.end method


# virtual methods
.method public final i()Lw8/e;
    .locals 1

    iget-object v0, p0, Lg8/o$d;->j:Lw8/e;

    return-object v0
.end method
