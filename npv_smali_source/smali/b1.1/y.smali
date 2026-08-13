.class public final synthetic Lb1/y;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lj1/c;


# instance fields
.field public final synthetic a:Lb1/z;


# direct methods
.method public synthetic constructor <init>(Lb1/z;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lb1/y;->a:Lb1/z;

    return-void
.end method


# virtual methods
.method public final a(F)F
    .locals 1

    iget-object v0, p0, Lb1/y;->a:Lb1/z;

    invoke-static {v0, p1}, Lb1/z;->E(Lb1/z;F)F

    move-result p1

    return p1
.end method
