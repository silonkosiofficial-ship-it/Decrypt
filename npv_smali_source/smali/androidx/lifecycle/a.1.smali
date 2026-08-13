.class public abstract Landroidx/lifecycle/a;
.super Landroidx/lifecycle/T;
.source "SourceFile"


# instance fields
.field private final b:Landroid/app/Application;


# direct methods
.method public constructor <init>(Landroid/app/Application;)V
    .locals 1

    const-string v0, "application"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Landroidx/lifecycle/T;-><init>()V

    iput-object p1, p0, Landroidx/lifecycle/a;->b:Landroid/app/Application;

    return-void
.end method
